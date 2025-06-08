#include <iostream>
using std::cout;
using std::endl;
using std::cin;

#include <string>
using std::string;

#include <fstream>


class Saving: public Account {
    private:
        const double interest = 2/100;
        const double feeAdult = 20.99;
        const double feeSenior = 10.99;
        const int numberOfTransaction = 3;




    public:
        Saving(int age) { 
            int fee = (age >= 65) ? feeSenior : feeAdult;

        }
};