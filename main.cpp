#include <iostream>
using std::cout;
using std::endl;
using std::cin;

#include <string>
using std::string;

#include "Account.cpp"
#include "Checking.cpp"
#include "Saving.cpp"
#include "Business.cpp"

void option(int);
void menu();

// note: to test 
// going to use js to  create account, login a

int main() {
    int ans;
    
    do {
     
        

        
        menu();
        cin >> ans;
        option(ans);

    } while (ans != 5);  
}


void option(int num) {
    switch(num) {
        case 1:

        case 2:

        case 3:

        case 4:

        default: 
            cout << "Please Select the option" << endl;
    }
}


void menu() {
    cout << "=== Expense Tracker ===" << endl;
    cout << "1. Add Expense" << endl;
    cout << "2. View All Expenses" << endl;
    cout << "3. Monthly Expense" << endl;
    cout << "4. Export to CVS" << endl;
    cout << "5. Exit" << endl;
    cout << "-----------------------" << endl;
    cout << "Enter your choice: ";
}



