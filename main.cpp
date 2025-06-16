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
            
            string name;
            string email;
            string address;
            string city;
            string province;
            string zipcode;

            cout << "Enter name: ";
            cin >> name;
            cout << "Enter email: ";
            cin >> email;
            cout << "Enter address: ";
            cin >> address;
            cout << "Enter city: ";
            cin >> city;
            cout << "Enter province: ";
            cin >> province;
            cout << "Enter zipcode: ";
            cin >> zipcode;
            
            Account a1 = new Account(name, email, address, city, province, zipcode);
            
        case 2:
            string username;
            string password;
            
            cout << "Username: ";
            cin >> username;
            cout << \n;

            cout << "Password: ";
            cin >> password;

            if (username != a2.email && password != a2.password) {
                cout << "Account Not Found";
            }
            else {
                Chequing ch = new Chequing();
                cout << "Hi " << a1.name << endl << "Chequing Account has been created;
                    
            }

        
        case 3:
            string username;
            string password;
            
            cout << "Username: ";
            cin >> username;
            cout << \n;

            cout << "Password: ";
            cin >> password;

           
            if (username != a2.email && password != a2.password) {
                cout << "Account Not Found";
            }
            else {
                Saving sv = new Saving();
                cout << "Hi " << a1.name << endl << "Saving Account has been created;
                    
            }
        case 4:
            string username;
            string password;
            
            cout << "Username: ";
            cin >> username;
            cout << \n;

            cout << "Password: ";
            cin >> password;

           
            if (username != a2.email && password != a2.password) {
                cout << "Account Not Found";
            }
            else {
                Business bs = new Business();
                cout << "Hi " << a1.name << endl << "Business Account has been created;          
            }

        case 5:
            string opt;
            double amount;
            cout << "Choose the account: ";
            cin >> opt;

            cout << "Choose amount: ";
            cin >> amount;

            if (opt == "chequing") {
                ch.add(amount);
            }

            else if (opt == "saving") {
                sv.add(amount);
            }

            else if (opt == "business) {
                bs.add(amount);
            }

            else {
                cout << "please select valid account" << endl;
            }

                
        case 6:
            string opt;
            double amount;
            cout << "Choose the account: ";
            cin >> opt;

            cout << "Choose amount: ";
            cin >> amount;

            if (opt == "chequing") {
                cout << "balance: " << ch.balance;
            }

            else if (opt == "saving") {
                cout << "balance: " << sv.balance;
            }

            else if (opt == "business) {
                cout << "balance: " << bs.balance;
            }

            else {
                cout << "please select valid account" << endl;
            }

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



