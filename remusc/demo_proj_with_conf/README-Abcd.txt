# Sample Project-Tree - with Abcd Main Config

# These are trimmed-down examples, for a quick-try.
#   The focus is on dependencies between projects.
#
# In this file, to easily copy and paste:
#   the text is commented, the commands are not.

# ----------
# Go to base directory of one of the project groups
  cd demo_basic_hello_group
# or
  cd demo_complex_group

# ----------
# Launch
  abcd --gen-make
  make # (optional target)
# or
  abcd --gen-jake
  jake # (optional target)
# or a combined version in case other tools expect a Makefile
  abcd --gen-jake-make
  make # (optional target)
# or
  abcd --gen-ninja
  ninja # (optional target)
# or
  abcd --gen-cmake
  cmake ...

# It also works with multiple generators (of different type) at once.
  abcd --gen-make --gen-jake --gen-ninja --gen-cmake
  abcd --gen-all
  make # (optional target)
  jake # (optional target)
  ninja # (optional target)
  cmake ...

# ----------
# For CMake:
# You can try to match cmake-build-dir with Abcd $BUILD_DIR_PREFIX/$PROJ_NAME
#   but this it is not mandatory.
# On Windows, pick the right generator.
# On Linux, the generator can also be "ninja".
  cmake -G "Unix Makefiles" -S . -B ../.build-cmake/
  cmake --build ../.build-cmake/ -j

# ----------
# Next:
# * play with project config - each project can have its own build flags
# * rename or modify some dirs/files
# * if a lib-project was renamed
#   * remember to update the library name in abc.conf where library is used
# * just run the build tool directly, no need to run also "abc"
#   the build instructions will be updated automatically
# * build from a sub-project
# * see what else is available
  abcd --help

# Note:
#   UIT is not activated, but the files are there,
#   so that the in-place tests are visible.
#   With UIT or another simple library, the "test" ARCH can be used.

# ----------
# The development cycle with Abcd briefly looks like this (for a developer):
  abcd --init # run this once, it means init and replace from scratch
  abcd        # OR run this once, it means init and update as needed
# do
#   # Edit, make changes in sub-projects ... fix errors ...
    make
    # Note: the build system uses parallel jobs that are updated when necessary.
# while (not-done)

# ----------
# Have fun :)

--
