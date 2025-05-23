#!/bin/bash
# Sample script.
#
# Commands to run BEFORE starting the whole build.
#

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# ? code adapt / generate
# ? coding style, prettify