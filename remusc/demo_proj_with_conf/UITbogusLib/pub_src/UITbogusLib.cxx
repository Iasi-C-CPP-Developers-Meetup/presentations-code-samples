///
/// UIT - minimal fake code
///     For demo to compile when tests are activated.
///     Not for serious use.
///
/// @note No test can be registered or run.
/// @note No errors are reported due to missing tests.
///
/// Use your own favorite unit and integration test library instead.
///

#include "UITbogusLib.hh"

unsigned char uitPrintAssert(const unsigned char bCond, const char * sCond,
                             const char * sFile, const unsigned int  nLine)
{
    (void)(bCond);
    (void)(sCond);
    (void)(sFile);
    (void)(nLine);
    return 1;
}

int uitMain(const char * sFile, const unsigned int nLine, const char * sAppName)
{
    (void)(sFile);
    (void)(nLine);
    (void)(sAppName);
    return 0;
}

// EOF //
