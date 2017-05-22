
import os
import os.path
import stat

R = range(0, 100000)
for x in R:
    filename = 'sources/test-tup-' + str(x) + '.c'
    if not os.path.isfile(filename):
        os.mknod(filename, 0600|stat.S_IRUSR)

template = """
CC=gcc
CFLAGS=-c
LDFLAGS=
SOURCES:=main.c {SOURCES}
OBJECTS=main.o {OBJECTS}

EXECUTABLE=hello

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
\t$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.c.o:
\t$(CC) $(CFLAGS) $< -o $@
"""

sources = [ "test-tup-" + str(x) + '.c' for x in R ]
objects = [ "test-tup-" + str(x) + '.o' for x in R ]
makefile = template.format(SOURCES=' '.join(sources), OBJECTS=' '.join(objects))
print(makefile)
