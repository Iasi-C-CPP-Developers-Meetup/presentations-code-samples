# inc jake-make 1-start >>

# These lines are actually for 'make',
#   for when it is used to launch 'jake'.

# When Jake is used, with Make wrapper:
#   Set jobs=1 to make argument targets to be taken in sequence,
#   while each target is build in parallel.
# e.g. "make clean all"
#   we want "clean" in parallel
#   we want "all" in parallel, but only after "clean" was finished.
# This variable is not explicitly used by 'jake'.
#
MFLAGS := -j1

# These lines are used by 'make' and ignored by 'jake'.
#
ifndef OS
	OS := Linux
endif
ifneq (,$(findstring Windows, $(OS) ))
	OS_NAME := Windows
else
	OS_NAME := Linux
endif

# inc jake-make 1-start <<
