#include <fstream>
#include <iostream>

using namespace std;

#define ELEMENTS_PER_GROUP 4

int main()
{
    int seed, groups_nr;

    cout << "Please enter the seed: ";
    cin >> seed;

    srand(seed);

    cout << "How many groups should we generate: ";
    cin >> groups_nr;

    ofstream output{"output.txt"};
    bool first_run = true;

    for (unsigned group_idx = groups_nr; group_idx; group_idx--) 
    {
        if (first_run)
        {
            first_run = false;
        }
        else
        {
            output << "\n";
        }
        
        for (int counter = ELEMENTS_PER_GROUP; counter; counter--)
        {
            output << rand();

            if (counter > 1)
                output << " ";
        }
    }

    return 0;
}