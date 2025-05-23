#include "DummyFn-OnlySrc.hh"
#include <stdio.h>

#ifdef __cplusplus
const char sHello[] = "!! Hello C++ / PC !!";
#else  // __cplusplus
const char sHello[] = "!! Hello plain-C / PC !!";
#endif // __cplusplus

int main(int argc, char ** argv)
{
    int retCode = 0;
    printf("\nRun: %s\n", argv[0 * argc]);
    fflush(NULL);
    retTrueDummyFn();
    printf("\n%s\n", sHello);
    printf("Done: %s\n\n", "0");
    return retCode;
}
