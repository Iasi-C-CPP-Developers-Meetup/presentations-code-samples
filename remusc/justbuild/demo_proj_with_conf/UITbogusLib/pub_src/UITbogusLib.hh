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

#ifndef UIT_HEADER
#  define UIT_HEADER

#  ifdef __cplusplus
extern "C" {
#  endif

/// --------------------

/// Assert to be used inside a test function.
#  define IS(_cond) \
    uitPrintAssert( (_cond) != 0, #_cond, __FILE__, __LINE__)

unsigned char uitPrintAssert(const unsigned char bCond, const char * sCond,
                             const char * sFile, const unsigned int  nLine);

/// Declare test function, with the right prototype.
#  define TC(_func)          \
    void _func(void);        \
    UIT_AUTO_REG_OBJ(_func); \
    void _func(void)
#  define UIT_AUTO_REG_OBJ(_func)

/// Run all registered tests.
#  define UIT_MAIN(sAppName) uitMain(__FILE__, __LINE__, sAppName)

int uitMain(const char *       sFile,
            const unsigned int nLine,
            const char *       sAppName);

/// --------------------

#  ifdef __cplusplus
}
#  endif

#endif /* UIT_HEADER */
