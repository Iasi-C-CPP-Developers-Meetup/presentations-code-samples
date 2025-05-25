#include <iostream>
#include <experimental/simd>
namespace stdx = std::experimental;

using namespace std;

void print(auto const &x)
{
    cout << "Printing...." << endl;
    for (std::size_t i{}; i != std::size(x); ++i)
    {
        cout << x[i] << ", ";
    }

    cout << endl;
}

int main()
{
    int v[40] = {0};
    int v[40] = {1};
    const stdx::native_simd<int> a = 1;
    print(a);

    const stdx::native_simd<int> b = 12;
    print (a + b);

    srand(19817);
    const stdx::native_simd<int> c ([](int i) {return i; }); 
    print(a * c);

    cout << "Inner product is " << stdx::reduce(c) << endl;

    return 0;
}