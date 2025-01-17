
#define PY_SSIZE_T_CLEAN

#include <Python.h>
#include <iostream>

class Simple {
    PyObject* module;
    PyObject* plus_func;

public:
    Simple();
    long plus(long a, long b);
    ~Simple() {
        Py_DECREF(plus_func);
        Py_DECREF(module);
    }

}; // class Simple

Simple::Simple()
{
    if (!Py_IsInitialized()) {
        // Initialize python access
        Py_Initialize();
    }

    module = PyImport_ImportModule("simple");

    if (!module) {
        throw std::runtime_error("simple module is not loaded");
    }

    plus_func = PyObject_GetAttrString(module, "plus");
}

long Simple::plus(long a, long b)
{
    // Make sure the attribute is callable
    if (!plus_func || !PyCallable_Check(plus_func)) {
        throw std::runtime_error("plus() is not callable");
    }

    // Create a tuple to contain the function's args
    PyObject* args = PyTuple_New(2);
    PyTuple_SetItem(args, 0, PyLong_FromLong(a));
    PyTuple_SetItem(args, 1, PyLong_FromLong(b));

    // Execute the plus function in simple.py
    PyObject* ret = PyObject_CallObject(plus_func, args);

    long retVal = PyLong_AsLong(ret);

    Py_DECREF(args);
    Py_DECREF(ret);

    return retVal;
}



/**
 * Requires libpython3.11.dll to run
 */
int main(int argc, char const *argv[])
{
    Simple simple;
    std::cout << simple.plus(4, 7) << std::endl;
}

#if 0
int main(int argc, char const *argv[])
{
    PyObject* module;
    PyObject* func;
    PyObject* args;
    PyObject* ret;

    std::cout << "~~~ BEGIN ~~~" << std::endl;

    // Initialize python access
    Py_Initialize();

    if (Py_IsInitialized()) {
        std::cout << "Python initialized successfully!" << std::endl;
    }
    else {
        std::cerr << "Failed to initialize Python." << std::endl;
    }

    // Print environment variables
    std::wcout << L"PYTHONHOME: " << Py_GetPythonHome() << std::endl;
    std::wcout << L"PYTHONPATH: " << Py_GetPath() << std::endl;

    PyRun_SimpleString("import sys; print(sys.version)");

    // Import the simple.py code
    module = PyImport_ImportModule("simple");

    if (module) {
        // Access the attribute named plus
        func = PyObject_GetAttrString(module, "plus");

        // Make sure the attribute is callable
        if (func && PyCallable_Check(func)) {
            std::cout << "is callable" << std::endl;

            // Create a tuple to contain the function's args
            args = PyTuple_New(2);
            PyTuple_SetItem(args, 0, PyLong_FromLong(4));
            PyTuple_SetItem(args, 1, PyLong_FromLong(7));

            // Execute the plus function in simple.py
            ret = PyObject_CallObject(func, args);
            Py_DECREF(args);
            Py_DECREF(func);
            Py_DECREF(module);

            // Check the return value
            if (ret) {

                // Convert the value to long and print
                long retVal = PyLong_AsLong(ret);
                std::cout << "Result: " << retVal << std::endl;

                Py_DECREF(ret);
            }
        }
    }

    // Finalize the Python embedding
    Py_Finalize();

    std::cout << "~~~ END ~~~" << std::endl;

    return 0;
}
#endif
