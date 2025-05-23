# Sample Project-Tree - with Abcd Main Config for JustBuild

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
  justbuild

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
  justbuild --help

# Note:
#   UIT is not activated, but the files are there,
#   so that the in-place tests are visible.
#   With UIT or another simple library, the "test" ARCH can be used.

# ----------
# The development cycle with Abcd briefly looks like this (for a developer):
  abcd --init # Run this once
              # to create configuration files where the projects are.
              # Then adapt them.
              # For minimum, binary output type must be specified.
# do
#   # Edit, make changes in sub-projects ... fix errors ...
    justbuild
    # Note: the build system uses parallel jobs that are updated when necessary.
# while (not-done)

# ----------
# Have fun :)

--
