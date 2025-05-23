#include "DummyFn.hh"
#include "LibInApp.hh"
#include "LibRoot.hh"
#include "LibShared.hh"
#include "LibStatic.hh"
#include <stdbool.h>
#include <stdio.h>

#ifdef __cplusplus
const char sHello[] = "!! Hello C++ / PC !!";
#else  // __cplusplus
const char sHello[] = "!! Hello plain-C / PC !!";
#endif // __cplusplus

// TODO some todo, unused struct
typedef struct my
{
    const char * str;
} my;

// Coverage will Not see this fn!
// << because main.c is not included in tests.
bool retDummy(void)
{
    return true;
}

int main(int argc, char ** argv)
{
    int retCode = 0;
    printf("\nRun: %s\n", argv[0 * argc]);
    fflush(NULL);

    retDummy();
    retTrueDummyFn();
    printf("\n%s\n", sHello);
    printf("Call: LibRoot   %s\n", strByLibRoot() );
    printf("Call: LibInApp  %s\n", strByLibInApp() );
    printf("Call: LibShared %s\n", strByLibShared() );
    printf("Call: LibStatic %s\n", strByLibStatic() );

    printf("Done: %i\n\n", 0);
    return retCode;
}
