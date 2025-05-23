#include "DummyFn-WithProj.cxx"
#include <UITbogusHdrOnly.hh>
#include <UITbogusLib.hh>

TC(DummyFn)
{
    IS(  retTrueDummyFn() );
    IS_P(retTrueDummyFn() );
}
