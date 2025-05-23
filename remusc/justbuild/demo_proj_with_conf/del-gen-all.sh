#!/bin/bash
set -v
rmrec -f -y "CMakeLists*.txt|jake*.jake|Makefile*|build*.ninja|.ninja*|*in_BUILD_DIR*|*.bak|*.log" "$@"
