#!/bin/bash
# Sample script.
#
# Commands to run BEFORE this arch starts.
#

# echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# bash dep_make.sh
# depmake
