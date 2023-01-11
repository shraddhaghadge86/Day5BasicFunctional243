package com.bridgelabz.day5basiccore;

public class PowerofTwo {
    public static void main(String[] args) {

        System.out.print(args[0]);
        int num = Integer.parseInt(args[0]);
        int result = 1;

        if (num >= 0 && num <= 30) {
            for (int i = 1; i <= num; i++) {

                result = 2 * result;
            }
        }else{
            System.out.println("\nplease enter number between 0 to 30");
        }

        System.out.println("\n"+ num + "th power of 2 is: " + result);
    }
}
