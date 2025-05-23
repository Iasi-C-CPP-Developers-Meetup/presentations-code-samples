#!/bin/bash
# Sample script.
#
# Capture command output in a log file.
#

# ! Warning ! Possible mixed messages with parallel builds.
#
# You can add your solution in this script,
#   or directly in the config file.
#
# Cannot pre-test what works reliably in your build environment.
#   Fallback to default (no log) to reduce the risk of mixing messages.
#

# Use your own preferred log capture method
"$@"
