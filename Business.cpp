#include <iostream>
using std::cout;
using std::endl;
using std::cin;

#include <string>
using std::string;

#include <fstream>

class Business: public Account {
    private:
        const double interest = 1/100;
        const double feeAdult = 20.99;
        const double feeSenior = 10.99;
        double balance = 0;




    public:
        Business(int age) { 
            double fee = (age >= 65) ? feeSenior : feeAdult;
            cout << "Fee for this account is: $" << fee << endl;

        }

        void add(int amount) {
            balance += ammount;
        }
};
