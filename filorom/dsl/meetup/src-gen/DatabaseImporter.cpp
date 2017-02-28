#include "DatabaseImporter.hpp"
#include <iostream>

void DatabaseImporter::import()
{
std::cout << "importing persons:" << std::endl;
std::cout << "   Florentin Picioroaga, address: Iasi, birthdate: 30.07.1977" << std::endl;
std::cout << "   Gabriel Grigore, address: Iasi, birthdate: 1.08.1975" << std::endl;
std::cout << "   Claudiu Burdulea, address: Iasi, birthdate: 1.08.1976" << std::endl;
std::cout << "\nimporting meetings:" << std::endl;
std::cout << "   23.02.2017" << std::endl;
std::cout << "      presentations:" << std::endl;
std::cout << "         Domain Specific Languages and C++ Code Generation by: ";
std::cout << "Florentin Picioroaga ,";
std::cout << std::endl;
std::cout << "      participants:" << std::endl;
std::cout << "         Florentin Picioroaga " << std::endl;
std::cout << "         Gabriel Grigore " << std::endl;
}
