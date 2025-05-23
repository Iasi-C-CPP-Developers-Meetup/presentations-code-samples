#!/bin/bash
set -v
lsrec -T x -n '*.sh' -c 'chmod -c -x'
lsrec -T f -y '*.sh' -c 'chmod -c +x,o-x'
