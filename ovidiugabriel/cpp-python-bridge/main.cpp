
#define PY_SSIZE_T_CLEAN

#include <Python.h>
#include <iostream>

/**
 * Requires libpython3.11.dll to run
 */
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
            }
        }
    }

    // Finalize the Python embedding
    Py_Finalize();

    std::cout << "~~~ END ~~~" << std::endl;

    return 0;
}
