#!/bin/bash
# Sample script.
#
# Commands to run AFTER the whole build completes.
# (postponed tasks, time consuming but still important)

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."
PS4=': ' ; [ $((BUILD_VERBOSE)) -le 0 ] || set -x

# ? coding rules
# ? coding quality

# ? note: ALL projects successfully completed
# echo "0:0: $PROJ_NAME whole build done" 1>&2
