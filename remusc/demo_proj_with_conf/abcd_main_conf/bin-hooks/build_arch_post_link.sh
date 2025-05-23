#!/bin/bash
# Sample script.
#
# Commands to run RIGHT AFTER LINK step for this arch.
#

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# ? strip executables
# ? run test(s)
# ? check coverage

