# Sample hook scripts

PATH should contain this directory.
Note:
  Abcd support changing PATH from Jake or Make.

The scripts and this directory are added here for reference,
  in case you want to quickly build for the first time the sample projects.

These scripts:
- Can be used in Abcd configuration files.
- Are called after predefined steps passed during build.
- These are samples which need an unix-like environment.
- Should be adapted to your needs.
  And maybe moved to a fixed location.

On Windows:
- Powershell or *.cmd scripts can be used instead.
- MSYS/Msys2/Msys64 or a similar unix-like environment can be used.
- Several versions of Git for Windows have had the right tools.

On Linux:
  After unpacking the archive, the executable bit should be set.
  However, it depends on the unpacker if this is the case.
  To be sure, run in this directory, once:
    chmod -c +x *.sh

--
