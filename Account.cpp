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
        string name;
        string email;

        string address;
        string city;
        string province;
        string zipcode;

        string username;
        string password; 

    public:
        Account(string name, string password) { // default constructor 
            this -> nane = name;
            this -> password = password;
        }

        Account(string name, string email, string address, string city, string province, string zipcode, string password) {
            this -> name = name;
            this -> email = email;
            this -> address = address;
            this -> city = city;
            this -> province = province;
            this -> zipcode = zipcode;
            this -> password = password;
        }


        string getName(string name) {
            return this -> name = name;
        }

        string getEmail(string email) {
            return this -> email = email;
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
