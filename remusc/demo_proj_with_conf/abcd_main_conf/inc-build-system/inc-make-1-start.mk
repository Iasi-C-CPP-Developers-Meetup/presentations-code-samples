# inc make 1-start >>
MAKE := make
MAKEFLAGS := $(MAKEFLAGS) --no-print-directory
# MFLAGS := -rR -j -l25 -Otarget --warn-undefined-variables
MFLAGS := -rR -Otarget --warn-undefined-variables

ifndef OS
	OS := Linux
endif
ifneq (,$(findstring Windows, $(OS) ))
	OS_NAME := Windows
else
	OS_NAME := Linux
endif

ifndef BUILD_VERBOSE
	BUILD_VERBOSE :=
endif
ifneq (,$(findstring --trace,$(MFLAGS)))
	BUILD_VERBOSE := 1
	export BUILD_VERBOSE
endif
ifneq (,$(BUILD_VERBOSE))
	export BUILD_VERBOSE
	$(info // $(MAKE) $(MFLAGS) $(CURDIR)/$(lastword $(MAKEFILE_LIST)) )
	$(info //     MFLAGS    : $(MFLAGS) )
	$(info //     MAKEFLAGS : $(MAKEFLAGS) )
endif

# inc make 1-start <<
