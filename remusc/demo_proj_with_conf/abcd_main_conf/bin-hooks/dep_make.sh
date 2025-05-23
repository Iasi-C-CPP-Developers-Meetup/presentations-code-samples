#!/bin/bash
#
# Combine existing dep files for next build.
#   Only the main idea was implemented here.
#
# ! Not for production use!
#
# Out file can be empty.
# No error with no dep files.
#

echo "~~ $PROJ_NAME $ARCH_NAME :" ${0##*[/\\]} $* "..."

S_DEP_EXTENSION="${S_DEP_EXTENSION:-dep}"
OUT_FILE=".depmake.mk"

sLs=$(find -iname "*.$S_DEP_EXTENSION")
# declare -p S_DEP_EXTENSION OUT_FILE sLs

(
  # echo "$sLs" | xargs -r sed -e '$s|$|\n|;' | sed -e 's|\\:[^:]*:|:|g;'
  echo "$sLs" | xargs -r sed -e '$s|$|\n|;'
) > "$OUT_FILE" 2>/dev/null
:
