#include "corout.h"

#include <iostream>

#define ITERATIONS 12

int main()
{
    MersenneGenerator g = generate();

    for (size_t i = 0; i < ITERATIONS; i++)
    {
        std::cout << g.GenerateNext() << std::endl;
    }

    return 0;
}