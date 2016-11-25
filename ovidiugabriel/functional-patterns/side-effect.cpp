
// Don't try this at work
// @see https://www.infoq.com/presentations/c-machine-code

#include <stdio.h>

int main(int argc, char const *argv[])
{
    int v[] = {0, 2, 4, 6, 8};
    int i = 1;
    
    //  example of side effect using increment operator
    int n = i + v[++i] + v[++i]; 

    printf("%d\n", n);
    return 0;
}

// g++ (GCC) 4.8.5 20150623 (Red Hat 4.8.5-4)
// => 12

// clang => 11
// intel => 13

// CERT EXP50-CPP. Do not depend on the order of evaluation for side effects
// MISRA Rule 12.4: The right-hand operand of a logical && or || operator must not contain side effects. 
