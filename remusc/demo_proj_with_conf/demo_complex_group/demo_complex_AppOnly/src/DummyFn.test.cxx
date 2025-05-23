#include "DummyFn.cxx"
#include <UITbogusHdrOnly.hh>
#include <UITbogusLib.hh>

TC(DummyFn)
{
    IS(  retTrueDummyFn() );
    IS_P(retTrueDummyFn() );
}
