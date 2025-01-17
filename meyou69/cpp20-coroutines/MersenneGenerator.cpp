#include "MersenneGenerator.h"

unsigned long long MersenneGenerator::GenerateNext()
{
    if (!handle.done())
    {
        handle.resume();
        return handle.promise().current_value;
    }

    return 0;
}