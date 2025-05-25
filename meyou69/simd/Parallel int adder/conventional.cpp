#include <iostream>
#include <fstream>
#include <array>
#include <sstream>

using namespace std;

#define ELEMENTS_PER_GROUP 4

class Calculator
{
    public:
        Calculator()
    {
        member = Operations::Addition;
        position = 0;
        result.fill(0);
    }

    void operator <<(unsigned b)
    {
        if (member == Operations::Addition)
        {
            result[position] += b;
        }
        else
        {
            result[position] -= b;
        }

        if ((position + 1) % ELEMENTS_PER_GROUP == 0)
        {
            position = 0;

            if (first_run)
            {
                first_run = false;
            }
            else{
                flip();
            }
        }
        else
        {
            position++;
        }
    }

    std::string getResult() 
    { 
        ostringstream str;
        for (int i = 0; i < ELEMENTS_PER_GROUP; i++) 
        {
            str << result[i] << ", ";
        }

        return str.str();
    }

    private:
    enum class Operations {
        Addition, Subtraction
    } member;

    std::array<unsigned, ELEMENTS_PER_GROUP> result;
    int position;
    bool first_run = true;

    void flip()
    {
        if(member == Operations::Addition) {
            member = Operations::Subtraction;
        }
        else
        {
            member = Operations::Addition;
        }
    }

};

int main()
{
    ifstream input{"output.txt"};
    Calculator calculator;

    while(input.good()) {
        unsigned sample;

        input >> sample;
        calculator << sample;
    }

    cout << "Final result: " << calculator.getResult() << std::endl;

    return 0;
}