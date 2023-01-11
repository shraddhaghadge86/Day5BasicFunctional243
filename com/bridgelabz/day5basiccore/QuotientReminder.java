package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Dividend and divisor: ");
        int dividend = s1.nextInt();
        int divisor = s1.nextInt();
        int qoutient = dividend/divisor;
        int reminder = dividend%divisor;

        System.out.println("Qoutient: "+qoutient+ "\nReminder: " +reminder);

    }
}
