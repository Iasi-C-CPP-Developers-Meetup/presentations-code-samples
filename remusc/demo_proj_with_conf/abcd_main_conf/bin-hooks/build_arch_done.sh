#!/bin/bash
# Sample script.
#
# Commands to run AFTER this arch ends.
#

# echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x
