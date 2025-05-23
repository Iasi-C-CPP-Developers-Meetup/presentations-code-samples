///
/// UIT Header-Only - minimal fake code
///     For demo to compile when tests are activated.
///     Not for serious use.
///
/// @note No test can be registered or run.
/// @note No errors are reported due to missing tests.
///
/// Use your own favorite unit and integration test library instead.
///

#ifndef UIT_HEADER_ONLY
#  define UIT_HEADER_ONLY

#  ifdef __cplusplus
extern "C" {
#  endif

#  include <stdio.h>

/// --------------------

/// Assert to be used inside a test function.
#  define IS_P(_cond)                                           \
    do {                                                        \
        if ( _cond ) break;                                     \
        (void)fprintf(stderr, "%s:%u: error: Failed Cond (%s)", \
                      __FILE__, __LINE__, #_cond);              \
        (void)fflush(stderr);                                   \
    } while (0)

/// --------------------

#  ifdef __cplusplus
}
#  endif

#endif /* UIT_HEADER_ONLY */
