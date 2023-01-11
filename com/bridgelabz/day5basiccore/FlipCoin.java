package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin: ");
    double num = s1.nextInt();

    double percent1 = 0;
    double percent0 = 0;
    int head = 0;
    int tails = 0;

        for(int i = 1; i<= num; i++) {
        double flipCoin = Math.random();
        System.out.println(flipCoin);
        if (flipCoin <= 0.5) {
            head++;

        }else {
            tails++;
        }
    }
    percent0 = (head * 100)/num;
    percent1 = (tails * 100)/ num;

        System.out.println("the head flips "+ head +" times \nthe percent of head is: " + percent0);
        System.out.println("the tails flips "+ tails + " times \nthe percent of tails is: " + percent1);
}
}
