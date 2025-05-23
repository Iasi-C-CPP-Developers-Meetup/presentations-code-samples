#include <stdio.h>

const char _sHello[] = "!! Hello from Windows !!";

int main(void)
{
    int retCode = 0;

    printf("\n%s\n", _sHello);

    printf("Done: %i\n\n", 0);
    return retCode;
}
