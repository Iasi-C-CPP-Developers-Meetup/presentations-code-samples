
//
// Compile this with:
//
//      gcc typesafe.cpp -std=c++11
//

#include <type_traits>

namespace boost {

namespace detail {

template <typename T> class empty_base {

// Helmut Zeisel, empty base class optimization bug with GCC 3.0.0
#if defined(__GNUC__) && __GNUC__==3 && __GNUC_MINOR__==0 && __GNU_PATCHLEVEL__==0
  bool dummy; 
#endif

};

} // namespace detail

template <class T, class B = ::boost::detail::empty_base<T> >
struct less_than_comparable1 : B
{
     friend bool operator>(const T& x, const T& y)  { return y < x; }
     friend bool operator<=(const T& x, const T& y) { return !(y < x); }
     friend bool operator>=(const T& x, const T& y) { return !(x < y); }
};

template <class T, class B = ::boost::detail::empty_base<T> >
struct equality_comparable1 : B
{
     friend bool operator!=(const T& x, const T& y) { return !(x == y); }
};

template <class T, class U, class B = ::boost::detail::empty_base<T> >
struct less_than_comparable2 : B
{
     friend bool operator<=(const T& x, const U& y) { return !(x > y); }
     friend bool operator>=(const T& x, const U& y) { return !(x < y); }
     friend bool operator>(const U& x, const T& y)  { return y < x; }
     friend bool operator<(const U& x, const T& y)  { return y > x; }
     friend bool operator<=(const U& x, const T& y) { return !(y < x); }
     friend bool operator>=(const U& x, const T& y) { return !(y > x); }
};

template <class T, class U, class B = ::boost::detail::empty_base<T> >
struct equality_comparable2 : B
{
     friend bool operator==(const U& y, const T& x) { return x == y; }
     friend bool operator!=(const U& y, const T& x) { return !(x == y); }
     friend bool operator!=(const T& y, const U& x) { return !(y == x); }
};

template <class T, class B = ::boost::detail::empty_base<T> >
struct totally_ordered1
    : less_than_comparable1<T
    , equality_comparable1<T, B
      > > {};

template <class T, class U, class B = ::boost::detail::empty_base<T> >
struct totally_ordered2
    : less_than_comparable2<T, U
    , equality_comparable2<T, U, B
      > > {};

} // end-namespace-boost


#define BOOST_STRONG_TYPEDEF(T, D)                              \
struct D                                                        \
    : boost::totally_ordered1< D                                \
    , boost::totally_ordered2< D, T                             \
    > >                                                         \
{                                                               \
    T t;                                                        \
    explicit D(T t_) : t(t_) {  };                          \
    private: explicit D(const int t_) : t(t_) { };                       \
    /* template <class P>                                                 \
       explicit D(P t_) {                                                 \
           static_assert(!std::is_same<T, P>::value, "Caca maca");        \
           t = t_;                                                        \
       };                                                                \
       */ \
    public: D(){};                                                      \
    D(const D & t_) : t(t_.t){}                                 \
    D & operator=(const D & rhs) { t = rhs.t; return *this;}    \
    /*D & operator=(const T & rhs) { t = rhs; return *this;} */     \
    /*operator const T & () const {return t; }                   */ \
    /*operator T & () { return t; }                               */\
    bool operator==(const D & rhs) const { return t == rhs.t; } \
    bool operator<(const D & rhs) const { return t < rhs.t; }   \
};

#include <stdbool.h>
#include <stdio.h>

BOOST_STRONG_TYPEDEF(bool, boolean);

int main(int argc, char const *argv[])
{
    boolean b;

    // b = boolean(1);
    // b = boolean(0);

    // b = 100;
    // b = -1;

    // b = 2.0;
    // b = "false";

    b = boolean(true);
    b = boolean(false);

    // printf("%d\n",  b);

    return 0;
}
