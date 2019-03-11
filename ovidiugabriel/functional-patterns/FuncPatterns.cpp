
// Found on internet ...

#include <functional>
#include <iostream>
#include <string>

#include <algorithm>
#include <ctype.h>
#include <functional>

#include <thread>
#include <mutex>
#include <chrono>

using namespace std;

//--------
// Helpers
//--------

void tick(int n)
{
    for(int i = 0; i < n; ++i)
    {
        cout << i << endl;
        this_thread::sleep_for(chrono::seconds(1));
    }
}

char firstChar(string s) {
    if (s.empty())
        return '.';
    else
        return *s.begin();
}

int length(string s)
{
    return s.length();
}

string concat(string s1, string s2)
{
    return s1 + s2;
}

unique_ptr<string> findById(int id)
{
    // fake accessing a database
    unique_ptr<string> result;
    if (id >= 0 && id < 100)
        result.reset(new string("Agent Jones"));
    return result;
}

function<string(string)> curriedConcat(string s)
{
    return bind(concat, s, placeholders::_1);
}

template<class A, class B>
pair<A, B> mk_pair(A a, B b)
{
    return make_pair(a, b);
}

template<class A, class B>
function<pair<A, B>(B)> curriedPair(A a)
{
    return std::bind(mk_pair<A, B>, a, placeholders::_1);
}

void testCurrying()
{
    // Test currying
    function<pair<int, string>(string)> cp = curriedPair<int, string>(1);
    pair<int, string> p1 = cp("two");

    curriedConcat("foo ")("bar ");
}

// unique_ptr as functor

template<class A, class B>
unique_ptr<B> fmap(function<B(A)> f, unique_ptr<A> p) 
{
    unique_ptr<B> result;
    if (p) 
        result.reset(new B(f(*p)));
    return result;
}

template<class A, class B>
unique_ptr<B> apply(unique_ptr<function<B(A)>> f, unique_ptr<A> p)
{
    unique_ptr<B> result;
    if (f && p)
        result.reset(new B((*f)(*p)));
    return result;
}

template<class A, class B, class C>
unique_ptr<C> fmap2(function<C(A, B)> f, unique_ptr<A> p1, unique_ptr<B> p2)
{
    unique_ptr<C> result;
    auto fCur = bind(f, *p1, placeholders::_1);
    if (p1 && p2)
        result.reset(new C(fCur(*p2)));
    return result;
}

template<class A>
unique_ptr<A> pure(A a)
{
    return unique_ptr<A>(new A(a));
}

template<class A, class B>
unique_ptr<B> bind(unique_ptr<A> p, function<unique_ptr<B>(A)> f)
{
    if (p)
        return f(*p);
    else
        return unique_ptr<B>();
}


void testUPtr()
{
    unique_ptr<string> s(new string("foo"));
    auto result = fmap<string, int>(&length, move(s));
    cout << "Length: " << *result << endl;

    unique_ptr<string> s1(new string("Hello "));
    unique_ptr<string> s2(new string("Applicative!"));
    auto res2 = fmap2<string, string, string>(&concat, move(s1), move(s2));
    cout << *res2 << endl;

    auto r3 = fmap2<string, string, string>(&concat, pure<string>("Pure "), pure<string>("Applicative!"));
    cout << *r3 << endl;

    unique_ptr<int> id(new int(5));
    auto r4 = bind<int, string>(move(id), &findById);
    cout << *r4 << endl;
}


//-------
// Async
//-------

template<class A>
struct Async {
    virtual ~Async() {}
    virtual void andThen(function<void(A)>) = 0;
};

//--------
// Functor
//--------

template<class A, class B>
struct Fmap : Async<B> {
    Fmap(function<B(A)> f, unique_ptr<Async<A>> asncA) 
        : _f(f), _asncA(move(asncA)) {}
    ~Fmap() {}
    void andThen(function<void(B)> k) {
        function<B(A)> f = _f;
        _asncA->andThen([k, f](A a)
        {
            k(f(a));
        });
    }
    function<B(A)> _f;
    unique_ptr<Async<A>> _asncA;
};

template<class A, class B>
unique_ptr<Async<B>> fmap(function<B(A)> f, unique_ptr<Async<A>> asncA)
{
    return unique_ptr<Async<B>>(new Fmap<A, B>(f, move(asncA)));
}

//--------------------
// Applicative Functor
//--------------------

template<class A>
struct Pure : Async<A>
{
    Pure(A val) : _a(a) {}
    void andThen(function<void(A)> k)
    {
        k(_a);
    }
    A _a;
};

template<class A, class B>
struct Apply : Async<B> {
    Apply(unique_ptr<Async<function<B(A)>>> asncF, unique_ptr<Async<A>> asncA)
        : _asncF(move(asncF)), _asncA(move(asncA)), _hasA(false), _hasF(false) {}
    ~Apply() {}
    void andThen(function<void(B)> k)
    {
        _asncF->andThen([this, k](function<B(A)> f)
        {
            lock_guard<mutex> l(_mtx);
            if (_hasA)
            {
                k(f(_a));
            }
            else
            {
                _f = f;
                _hasF = true;
            }
        });
        _asncA->andThen([this, k](A a)
        {
            lock_guard<mutex> l(_mtx);
            if (_hasF)
            {
                k(_f(a));
            }
            else
            {
                _a = a;
                _hasA = true;
            }
        });
    }
    unique_ptr<Async<function<B(A)>>> _asncF;
    function<B(A)> _f;
    bool _hasF;

    unique_ptr<Async<A>> _asncA;
    A _a;
    bool _hasA;

    mutex _mtx;
};

template<class A, class B>
unique_ptr<Async<B>> apply(unique_ptr<Async<function<B(A)>>> asncF, unique_ptr<Async<A>> asncA)
{
    return unique_ptr<Async<B>>(new Apply<A, B>(move(asncF), move(asncA)));
}

// Operator <$> for binary function
// Lift curried version of a binary function
template<class A, class B, class C>
struct Fmap2 : Async<function<C(B)>>
{
    Fmap2(function<C(A, B)> f2, unique_ptr<Async<A>> asncA) 
        : _f2(f2), _asncA(move(asncA)) {}
    ~Fmap2() {}
    void andThen(function<void(function<C(B)>)> k)
    {
        //function<function<string(string)>(string)>
        function<function<C(B)>(A)> curriedF2 = [this](A a)
        {
            return bind(_f2, a, placeholders::_1);
        };
        _liftedF2 = fmap<A, function<C(B)>>(curriedF2, move(_asncA));
        _liftedF2->andThen(k);
    }
    function<C(A, B)> _f2;
    unique_ptr<Async<A>> _asncA;
    unique_ptr<Async<function<C(B)>>> _liftedF2;
};

template<class A, class B, class C>
unique_ptr<Async<function<C(B)>>> fmap2(function<C(A, B)> f2, unique_ptr<Async<A>> asncA)
{
    return unique_ptr<Async<function<C(B)>>> (new Fmap2<A, B, C>(f2, move(asncA)));
}


//------
// Monad
//------

// Return is the same as Pure
template<class A>
struct Return : Async<A>
{
    Return(A val) : _val(val) {}
    ~Return() {}
    void andThen(function<void(A)> k)
    {
        k(_val);
    }
    A _val;
};

template<class A>
unique_ptr<Async<A>> mreturn(A a)
{
    return unique_ptr<Return<A>> (new Return<A>(a));
}

// m >>= f = Cont (\k -> andThen m (\a -> andThen (f a) k))

// asnc >>= rest = Cont (\k -> andThen asnc (\a -> andThen (rest a) k))
template<class A, class B>
struct Bind : Async<B>
{
    Bind(unique_ptr<Async<A>> asnc, function<unique_ptr<Async<B>>(A)> rest)
        : _asnc(move(asnc)), _rest(rest)
    {}
    ~Bind() {}
    void andThen(function<void(A)> k)
    {
        function<unique_ptr<Async>(A)> rest = _rest;
        function<void(A)> lambda = [k, rest](A a) 
        {
            return rest(a)->andThen(k); 
        };
        _asnc->andThen(lambda);
    }
    unique_ptr<Async<A>> _asnc;
    function<unique_ptr<Async<B>>(A)> _rest;
};

template<class A, class B>
unique_ptr<Async<B>> mbind(unique_ptr<Async<A>> asnc,  function<unique_ptr<Async<B>>(A)> rest)
{
    return unique_ptr<Async<B>>(new Bind<A, B>(move(asnc), rest));
}


//-------
// Monoid
//-------

template<class A>
struct Mplus : Async<A>
{
    Mplus(unique_ptr<Async<A>> asnc1, unique_ptr<Async<A>> asnc2) 
    : _asnc1(move(asnc1)), _asnc2(move(asnc2)), _done(false)
    {}
    ~Mplus() {}
    void andThen(function<void(A)> k)
    {
        _asnc1->andThen([this, k](A a)
        {
            lock_guard<mutex> l(_mtx);
            if (!_done)
            {
                _done = true;
                k(a);
            }
        });
        _asnc2->andThen([this, k](A a)
        {
            lock_guard<mutex> l(_mtx);
            if (!_done)
            {
                _done = true;
                k(a);
            }
        });
    }
    unique_ptr<Async<A>> _asnc1;
    unique_ptr<Async<A>> _asnc2;
    bool _done;
    mutex _mtx;
};

template<class A>
unique_ptr<Async<A>> mplus(unique_ptr<Async<A>> asnc1, unique_ptr<Async<A>> asnc2)
{
    return unique_ptr<Async<A>>(new Mplus<A>(move(asnc1), move(asnc2)));
}

template<class A>
struct Mzero : Async<A>
{
    void andThen(function<void(A)>)	{}
};

template<class A>
unique_ptr<Async<A>> mzero()
{
    return unique_ptr<Async<A>>(new Mzero<A>());
}

//----------------
// Fake async APIs
//----------------

void getStringAsync(string s, function<void(string)> handler)
{
    thread th([s, handler]()
    {
        cout << "Started async\n";
        this_thread::sleep_for(chrono::seconds(3));
        handler("Done async: " + s);
    });
    th.detach();
}

struct AsyncString : Async<string>
{
    AsyncString(string s) : _s(s) {}
    void andThen(function<void(string)> k)
    {
        getStringAsync(_s, k);
    }
    string _s;
};

unique_ptr<Async<string>> asyncString(string s)
{
    return unique_ptr<Async<string>>(new AsyncString(s));
}

void getIntAsync(int i, function<void(int)> handler) {
    thread th([i, handler]()
    {
        cout << "Started getIntAsync\n";
        this_thread::sleep_for(chrono::seconds(3));
        handler(i + 1);
    });
    th.detach();
}

struct AsyncInt : Async<int>
{
    AsyncInt(int i) : _i(i) {}
    void andThen(function<void(int)> k)
    {
        getIntAsync(_i, k);
    }
    int _i;
};


unique_ptr<Async<int>> asyncInt(int i)
{
    return unique_ptr<Async<int>>(new AsyncInt(i));
}

struct Loop : Async<string>
{
    Loop(string s) : _s(s) {}

    void andThen(function<void(string)> k) {
        cout << "Loop::andThen: " <<_s << endl;
        unique_ptr<Async<string>> asyncA = asyncString("A");
        _bound = mbind<string, string>(
            move(asyncA), 
            [](string s) -> unique_ptr<Async<string>>
            {
                unique_ptr<Async<string>> ft(new Loop(s));
                return ft;
            });
        _bound->andThen(k);
    }
    string _s;
    unique_ptr<Async<string>> _bound;
};


// Combine a pair of asyncs into an async of a pair
template<class A, class B>
unique_ptr<Async<pair<A, B>>> andAsncPair(unique_ptr<Async<A>> asncA, unique_ptr<Async<B>> asncB)
{
    unique_ptr<Async<function<pair<A, B>(B)>>> liftedPair = fmap<A, function<pair<A, B>(B)>>(curriedPair<A, B>, move(asncA));
    return apply<B, pair<A, B>>(move(liftedPair), move(asncB));
}

void testApply()
{
    auto x = apply(
        fmap2<string, int, pair<string, int>>(
            mk_pair<string, int>, 
            asyncString(" Alpha ")), 
            asyncInt(100));

    x->andThen([](pair<string, int> p) { cout << "(" << p.first << ", " << p.second << ")" << endl; });

    tick(100);
}


void testLoop()
{
    // Test looping
    Loop("Loop: ").andThen([](string s) 
    { 
        cout << "Never happens: " << s << endl; 
    });

    tick(100);
}

void testAppliedConcat()
{
    // Test fmap applied to a curried function

    // (++) <$> callApi("Hi ") <*> callApi(" there! ")

    auto arg1 = asyncString(" Hi ");
    auto arg2 = asyncString(" there! ");

    unique_ptr<Async<function<string(string)>>> liftedConcat = fmap<string, function<string(string)>>(curriedConcat, move(arg1));

    // Test apply
    auto appliedConcat = apply(move(liftedConcat), move(arg2));

    appliedConcat->andThen([](string s) 
    { 
        cout << "Applied concat to asyncs: " << s << endl; 
    });

    tick(100);
}

void testAnd()
{
    // Test and combinator
    auto andF = andAsncPair(asyncInt(1), asyncString("Second arg "));
    andF->andThen([](pair<int, string> p) 
    { 
        cout << "And of two asyncs: (" << p.first << ", " << p.second << ")" << endl; 
    });

    tick(100);
}

void testOr()
{
    // Test or combinator / mplus
    auto or = mplus<string>(asyncString(" One "), asyncString(" Two "));
    or->andThen([](string s)
    {
        cout << "Or returned: " << s << endl;
    });
    
    // Test or combinator with mzero
    auto or1 = mplus<string>(mzero<string>(), asyncString(" Two "));
    or1->andThen([](string s)
    {
        cout << "Or with mzero returned: " << s << endl;
    });
    
    tick(100);
}

void testFmap()
{
    unique_ptr<Async<string>> callApi = asyncString("hi!");
    unique_ptr<Async<char>> asncC = fmap<string, char>(&firstChar, move(callApi));
    asncC->andThen([](char c)
    {
        cout << "-> " << c << endl;
    });
    
    tick(100);
}

void main()
{
    auto r = mreturn<string>("foo");
    r->andThen([](string s) { cout << s << endl; });
    testLoop();
}

