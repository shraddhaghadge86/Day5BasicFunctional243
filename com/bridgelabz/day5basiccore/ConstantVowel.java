package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class ConstantVowel {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any Character:");
        char ch = s1.next().charAt(0);

        if(ch == 'a' || ch == 'a' || ch == 'a'|| ch == 'a'|| ch == 'a'){
            System.out.println(ch +" is Vowel");
        }else
            System.out.println(ch +" is Constant");
    }
}
