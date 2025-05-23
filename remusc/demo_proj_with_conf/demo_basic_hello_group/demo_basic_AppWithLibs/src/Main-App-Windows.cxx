#include "LibHdrOnly.hh"
#include "LibUsual.hh"
#include <stdio.h>

const char _sHello[] = "!! Hello from Windows !!";

int main(void)
{
    int retCode = 0;

    printf("\n%s\n", _sHello);
    printf("Call: LibHdrOnly %s\n", strByLibHdrOnly() );
    printf("Call: LibUsual   %s\n", strByLibUsual() );

    printf("Done: %i\n\n", 0);
    return retCode;
}
