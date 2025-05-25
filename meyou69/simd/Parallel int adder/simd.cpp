#include <iostream>
#include <fstream>
#include <experimental/simd>

using namespace std;

#define ELEMENTS_PER_GROUP 4


enum class Operation
{
    Addition,
    Subtraction
};

void print(auto const &x)
{
    for (std::size_t i{}; i != std::size(x); ++i)
    {
        cout << x[i] << ", ";
    }

    cout << endl;
}

int main()
{
    ifstream input{"output.txt"};
    Operation current_operation = Operation::Addition;

    auto read_from_file = [&input] (unsigned x) { 
        unsigned file_input;
        input >> file_input;
        return file_input;
    };

    experimental::native_simd<unsigned> operand1(read_from_file);

    while(input.good()) {
         const experimental::native_simd<unsigned> operand2(read_from_file);

         if (current_operation == Operation::Addition)
         {
            current_operation = Operation::Subtraction;
            operand1 += operand2;
         }
         else
         {
            current_operation = Operation::Addition;
            operand1 -= operand2;
         }
    }     
    
    cout << "Final result: ";
    print(operand1);
}