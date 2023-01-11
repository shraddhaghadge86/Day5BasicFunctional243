package com.bridgelabz.day5functional;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 3 values to find roots of equation: ");
        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        float delta = (b * b)-(4 * a * c);
        if (delta>0.0)
        {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (delta == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }

    }
}
