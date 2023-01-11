package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class PrimeFactor {
    static int num;
    static int c= 0,i,j;

    static void primeFactor(){
        for(j = 2; j<= i; j++){
            if((i%j)==0){
                c++;
            }
        }
        if(c==1){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        num = s1.nextInt();
        System.out.println("The Prime factors are: ");
        for(i=2; i<=num;i++) {
            if ((num % i) == 0) {
                primeFactor();
                c=0;
            }
        }
    }
}
