
import os
import os.path
import stat

R = range(0, 100000)
for x in R:
    filename = 'sources/test-tup-' + str(x) + '.c'
    if not os.path.isfile(filename):
        os.mknod(filename, 0600|stat.S_IRUSR)
