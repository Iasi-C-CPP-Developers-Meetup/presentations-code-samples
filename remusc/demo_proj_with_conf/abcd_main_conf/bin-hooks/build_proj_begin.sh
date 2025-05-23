#!/bin/bash
# Sample script.
#
# Commands to run BEFORE this project starts.
#

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# ? regen4ide
