package com.bridgelabz.day5functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args){

        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter Two point to calculate distance: ");
        int x = s1.nextInt();
        int y = s1.nextInt();

        float d = (x * x)+(y * y);
        float distance = (float) Math.pow(d, 0.5);

        System.out.println("The distance from points "+x+" and "+y+" is: " +distance);


    }
}
