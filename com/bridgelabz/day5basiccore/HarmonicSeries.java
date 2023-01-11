package com.bridgelabz.day5basiccore;

import java.util.Scanner;

public class HarmonicSeries {public static void main(String[] args){

    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter Nth harmonic Number: ");
    int num = s1.nextInt();

    float result = 0.0F;

    System.out.println("The harmonic series is: ");
    for(int i = num; i>0; i--){
        result = result + (float)1/i;

        System.out.print(result + ", ");
    }
    System.out.print("\n" + num + "th harmonic value is: " + result);

}
}
