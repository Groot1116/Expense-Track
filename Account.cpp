#include <iostream>
using std::cout;
using std::endl;
using std::cin;

#include <string>
using std::string;

#include <fstream>

class Account {
    private:
        int ID;
        string firstName;
        string lastName;

        string address;
        string city;
        string province;
        string zipcode;

        string username;
        string password; 

    public:
        Account() { // default constructor 

        }

        Account(string firstName, string lastName, string address, string city, string province, string zipcode, string password) {
            this -> firstName = firstName;
            this -> lastName = lastName;
            this -> address = address;
            this -> city = city;
            this -> province = province;
            this -> zipcode = zipcode;
            this -> password = password;
        }


        string getFirstName(string firstName) {
            return this -> firstName = firstName;
        }

        string getLastName(string lastName) {
            return this -> lastName = lastName;
        }

        string getAddress(string adress) {
            return this -> address = address;
        }

        string getCity(string city) {
            return this -> city = city;
        }

        string getProvince(string province) {
            return this -> province = province;
        }

        string getZipcode(string zipcode) {
            return this -> zipcode = zipcode;
        }


        
};