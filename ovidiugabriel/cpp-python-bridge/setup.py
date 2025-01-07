from setuptools import setup, Extension

#needed:
#   pip install --upgrade wheel setuptools

module = Extension(
    "example",
    sources=["examplemodule.c"],
    extra_compile_args=["-std=c99"],  # GCC flag for C99 standard
    extra_link_args=[],
)

setup(
    name="example",
    version="1.0",
    description="A simple C extension for Python using GCC",
    ext_modules=[module],
)
