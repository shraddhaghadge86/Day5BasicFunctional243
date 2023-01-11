package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class Swap2Number {
    public static void main(String[] args){

    Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
    int num1 = s1.nextInt();
    int num2 = s1.nextInt();
        System.out.println("Number1: "+num1+ " Number2: " +num2);

    int temp = num1;
    num1 = num2;
    num2 = temp;

        System.out.println("The number after Swapping is: ");
        System.out.println("Number1: "+num1+ "\nNumber2: " +num2);
}
}
