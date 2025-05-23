#!/bin/bash
# Sample script.
#
# Commands to run AFTER this project ends.
# (postponed tasks, time consuming but still important)

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# ? extra steps for this (sub)project

# ? note: THIS project successfully completed
# echo "0:0: $PROJ_NAME build done" 1>&2
