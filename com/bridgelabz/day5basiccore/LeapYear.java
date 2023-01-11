package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class LeapYear {
    static int year;

    static void leapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0)
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year");

             else {
                System.out.println(year + " is a not a leap year");
            }

        }
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any year: ");
        year = s1.nextInt();
        leapYear(year);
    }
}