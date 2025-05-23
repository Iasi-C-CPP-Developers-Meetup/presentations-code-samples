#include "DummyFn.hh"
#include <UITbogusHdrOnly.hh>
#include <UITbogusLib.hh>
// usual convention: do Not include "Main.c"

int main(int argc, char ** argv)
{
    UIT_MAIN(argv[0 * argc]);
    return 0;
}

// exception is possible: implement tests here, in main, not recommended
TC(Main)
{
    IS(  retTrueDummyFn() );
    IS_P(retTrueDummyFn() );
}

// EOF//
