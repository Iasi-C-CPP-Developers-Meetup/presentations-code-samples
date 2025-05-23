
# Variables (vars)

## Main variables vs temporary user variables:

Main variables:
* in UPPERCASE
* AND not starting with "_"
* AND appear and are described in the official configuration files

The main variables are interpreted and used after the configuration files are read.

## Main variable names:

Main variable names are prefixed with tags.
The tag indicates how the variable is used.

LS_*  : Contains a list.
        Sequential separators [ \t\n\r] will be converted to ' ' separator.
WP_*  : Contains a wildcard-pattern.
        Sequential separators [ \t\n\r|] will be converted to '|' separator.
WP_name_YES, WP_name_NOT:
        'WP_*' variable used to create a 'LS_name' variable.
        When used, 'WP_name_YES' will filter-in.
          Input items that match WP are added to 'LS_name'.
        When used, 'WP_name_NOT' will filter-out.
          Input items that match WP are not added to 'LS_name'.
PATH_*:
        Contains an OS specific PATH.
        Use the appropriate OS PATH separator for the right OS.
TXT_* : Contains a text.
        Separators [\n\r] will be converted to '\n' separator.
        Depending on the context, indentation matters or not.
CMD_* : Contains a list of commands.
        Separators [\r\n].
        '-' at start means the return code will be considered success.
        '@' at start is ignored.
S_*   : Plain string.
N_*   : Number.
OS_*  : OS specific.
PROJ_*: Project specific.
ARCH_*: ARCH specific.
TOOL_*: External Tool: jake, make, ninja, cmake. // Abcd only
STEP_*: Contains a list of groups of commands. // JustBuild only
        Separators [\r\n].
        '-' at start means the return code will be considered success.
        '@' at start is ignored.
        Indentation matters.

## User variable names:

_*    : Local/temporary user variable used as input for main variables.

User variables:
* starting with "_"
* OR do not appear in the official configuration files

Users can create their own variables using:
* lower or mixed case in their names
* prefix '_'

Users can also create new UPPERCASE variables that do not start with "_".
  But that doesn't make it a main variable because that new name is unknown.

Avoid using main tags for a user variable.
  The final value of that variable may not be exactly what the user expects.

## Variables available everywhere:
  OS_NAME :
            Host OS name. Values: 'Linux', 'Windows'.
  PROJ_NAME :
            Directory name (without path) which contains the project files.
            This directory contains `abcd*.conf` and generated jake/make/ninja/cmake files.
            This value is used for the name of the target binary file.
  PROJ_DIR :
            Absolute path to project's base directory.
  PROJ_BUILD_DIR :
            Absolute path to project's build directory.
            It is: S_BUILD_DIR_BASE PROJ_NAME S_BUILD_DIR_SUFFIX
  PROJ_DEPLOY_DIR :
            Absolute path to project's deploy base directory.
            It is: S_DEPLOY_DIR_BASE PROJ_NAME S_DEPLOY_DIR_SUFFIX
  PROJ_BIN_TYPE :
            The output binary type after build.
  PROJ_BIN_FILE :
            The output binary file name with extension.
  APP_INAME :
            Application internal name. Values: 'abcd', 'justbuild'.

## Variables available only for ARCH build level:
  ARCH_NAME     : current ARCH: name. Is PROJ_NAME for 1st ARCH.
  ARCH_BIN_TYPE : current ARCH: output binary type. Is PROJ_BIN_TYPE for 1st ARCH.
  ARCH_BIN_NAME : current ARCH: output binary name without extension. Is PROJ_NAME for 1st ARCH.
  ARCH_BIN_FILE : current ARCH: output binary name with extension. Is PROJ_BIN_FILE for 1st ARCH.
  ARCH_BUILD_DIR:
              Absolute path to current ARCH's build directory.
  TOOL_NAME     : jake/make/ninja/cmake // Abcd only

## Variables available only for Compile & Link:
  IN_PATH   : $^/$+ in make, $in in ninja
              At link this is a list with input files.
              Each item can contain an absolute or relative path.
  IN_FILE   : The filename part of (each item from) IN_PATH.

  OUT_PATH  : $@ in make, $out in ninja
  OUT_FILE  : The filename part of OUT_PATH.

Variables can be exported to scripts with `env` tool.
Variables can be defined in config files or taken from the environment.

## Variable assignment:
* Overwrite:
  VAR_NAME = "1" # assign
  VAR_NAME = "2" # later a new value is assigned, value is now "2"
* Append or prepend:
  VAR_NAME = "1"           # assign,  value is now "1"
  VAR_NAME = "2 $VAR_NAME" # prepend, value is now "2 1"
  VAR_NAME = "$VAR_NAME 3" # append,  value is now "2 1 3"
  VAR_NAME += "4"          # append,  value is now "2 1 3 4"

## Display variables

`varsDump` is useful to display a variable and its value.
  However, the value can be changed later.
  Note that some special variables (e.g. `CMD_*`) are evaluated just before use,
  so the displayed value may differ from the final value.

// EOF //
