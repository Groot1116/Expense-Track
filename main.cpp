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

/*
clang++ backend/main.cpp -o backend/main
npm install
npm start

*/


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

    } while (ans != 8); 
     
}


void option(int num) {
    switch(num) {
        case 1:
            Account a1 = new Account();
            
        case 2:
            string username;
            string password;
            
            cout << "Username: ";
            cin >> username;
            cout << \n;

            cout << "Password: ";
            cin >> password;

            Account a2 = new Account(username, password);

            if (username != a2.email && password != a2.password) {
                cout << "Account Not Found";
            }
            else {
                cout << "Hi " << a1.name << endl << "Account has been created;
            }

        
        case 3:
            

        
        

        case 4:

        case 5:

        case 6:

        case 7:


        case 8:

        case 9: 
            break;


        default: 
            cout << "Please Select the option" << endl;
    }
}


void menu() {
    cout << "=== Expense Tracker ===" << endl;
    cout << "1. Create Account" << endl;
    cout << "2. Add Chequing Account" << endl;
    cout << "3. Add Saving Account" << endl;
    cout << "4. Add Business Account" << endl;
    cout << "5. Add Expense" << endl;
    cout << "6. View All Expenses" << endl;
    cout << "7. Monthly Expense" << endl;
    cout << "8. Export to CVS" << endl;
    cout << "9. Exit" << endl;
    cout << "-----------------------" << endl;
    cout << "Enter your choice: ";
}



