
import os
import os.path
import stat

srcdir = "sources"
if not os.path.exists(srcdir):
    os.makedirs(srcdir)

filepattern = 'test-tup-{x}.c'
for x in range(0, 100000):
    filename = srcdir + '/' + filepattern.format(x=str(x))
    if not os.path.isfile(filename):
        os.mknod(filename, 0600|stat.S_IRUSR)
