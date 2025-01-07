#define PY_SSIZE_T_CLEAN
#include <Python.h>

// A simple function: adds two numbers
static PyObject* example_add(PyObject* self, PyObject* args) {
    int a, b;
    // Parse the input tuple
    if (!PyArg_ParseTuple(args, "ii", &a, &b)) {
        return NULL;
    }
    // Return the sum
    return PyLong_FromLong(a + b);
}

// Method definitions
static PyMethodDef ExampleMethods[] = {
    {"add", example_add, METH_VARARGS, "Add two integers."},
    {NULL, NULL, 0, NULL}  // Sentinel
};

// Module definition
static struct PyModuleDef examplemodule = {
    PyModuleDef_HEAD_INIT,
    "example",  // Name of the module
    NULL,       // Module documentation (optional)
    -1,         // Size of per-interpreter state (-1 if no state)
    ExampleMethods
};

// Module initialization function
PyMODINIT_FUNC PyInit_example(void) {
    return PyModule_Create(&examplemodule);
}
