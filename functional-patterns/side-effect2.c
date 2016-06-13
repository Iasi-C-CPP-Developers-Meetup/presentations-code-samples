
/* build: gcc __FILE__ */

#include <stdio.h>

int foo(int n) {
    printf("Foo got %d\n", n); 
    return 0;
}
int bar(int n) {
    printf("Bar got %d\n", n);
    return 0;
}

typedef int (*TFunction)();

int main(int argc, char *argv[]) {
    int m = 0;

    TFunction fun_array[3];

    int i = 1;
    int ii = i/++i;

    printf("\ni/++i = %d, ",ii);
    fun_array[1] = foo;
    fun_array[2] = bar;
    (fun_array[++m])(++m);
}

// Result is:
//     i/++i = 1, Foo got 2
