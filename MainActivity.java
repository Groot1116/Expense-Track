package com.example.myapplication;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.Month;


public class Account {
    private final double interest = 1/100;
    private final double adultFee = 20.99;
    private final double seniorFee = 10.99;

    private String name;
    private String email;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int age;
    private String address;
    private String city;
    private String province;
    private String zipcode;
    private String username;
    private String password;






    @RequiresApi(api = Build.VERSION_CODES.O)
    public Account(String name, String email, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, String city, String province, String zipcode, String password) {
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        age = convertAge(yearOfBirth, monthOfBirth, dayOfBirth);
        this.address = address;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        username = email;
        this.password = password;

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Account(String email, String password) {
        this.name = name;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        age = convertAge(yearOfBirth, monthOfBirth, dayOfBirth);
        this.address = address;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        username = email;
        this.password = password;
    }



    @RequiresApi(api = Build.VERSION_CODES.O)
    public int convertAge(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        int oldestHuman = 122;
        LocalDate date = LocalDate.now();

        if (date.lengthOfMonth() < monthOfBirth || date.lengthOfMonth() < dayOfBirth) {
            System.out.println("Date Does Not Exist");
            return -1;
        }

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int sumDay = 0;

        for (Month months : Month.values()) {
            LocalDate birthYear = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
            sumDay += birthYear.lengthOfMonth();
        }


        for (int i = yearOfBirth + 1; year >= i; i++) {
            for (Month months : Month.values()) {
                LocalDate dates = LocalDate.of(yearOfBirth, month, 1);

                if (dates.getYear() == year && dates.getMonthValue() == month && dates.getDayOfMonth() == day) {
                    break;
                }
                sumDay += dates.lengthOfMonth();
            }
        }

        int age = sumDay / 365;

        if (age <= 0) {
            System.out.println("You are a sperm");
            return -1;
        } else if  (age > 122) {
            System.out.println("You are old and stinky");
            return -1;
        }
        return age;
    }

    public String getUsername() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public int getAge() {
        return age;
    }



    public double getFee() {
        return ((age >= 65) ? seniorFee : adultFee);
    }
}








