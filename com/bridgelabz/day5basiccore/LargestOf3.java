package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = s1.nextInt();
        int num2 = s1.nextInt();
        int num3 = s1.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is largest Number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 +" is largest Number");
        }else
            System.out.println(num3 +" is largest Number");
    }
}
