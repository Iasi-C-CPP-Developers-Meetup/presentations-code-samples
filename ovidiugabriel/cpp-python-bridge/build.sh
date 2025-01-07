PYTHON_INC=/c/msys64/mingw64/include/python3.11

set -x
g++ -I${PYTHON_INC} main.cpp -L/c/msys64/mingw64/lib -lpython3.11
if [ "$?" != "0" ] ; then
    exit 1
fi

# required to be able to load python modules from the current folder
SCRIPT_DIR=$(dirname "$(realpath "$0")")

EXT_DIR=$SCRIPT_DIR/build/lib.mingw_x86_64-cpython-311

export PYTHONHOME=/c/msys64/mingw64
export PYTHONPATH="$SCRIPT_DIR:$EXT_DIR:/c/msys64/mingw64/lib/python3.11"

# remove old folders
rm -rf __pycache__
rm -rf build

# Build the extension
python setup.py build

# Run test program
./a.exe
