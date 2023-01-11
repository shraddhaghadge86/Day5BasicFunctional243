package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = s1.nextInt();

        if(num%2 == 0){
            System.out.println("Number is even");
        }else
            System.out.println("Number is odd");
    }

}
