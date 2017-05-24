CC=gcc
CFLAGS=-c
LDFLAGS=
SOURCES=*.c
EXECUTABLE=hello

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): *.o
	$(CC) $(LDFLAGS) $^ -o $@

%.o : %.c
	$(CC) -c $(CFLAGS) $< -o $@
