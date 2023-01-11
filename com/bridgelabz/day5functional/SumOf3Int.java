package com.bridgelabz.day5functional;

import java.util.Scanner;

public class SumOf3Int {
    public static void main(String[] args){

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter total length of an array: ");
        int length = s1.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Array Elements: ");

        for(int i = 0; i<length;i++){
            arr[i] = s1.nextInt();
        }
        int count = 0;
        for(int i = 0; i<length-2;i++){
            for(int j = i+1;j<length-1;j++){
                for(int k = j+1;k<length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        count++;
                        System.out.println("Distinct Triplets are: " +arr[i]+"  "+arr[j]+"  "+arr[k]);
                    }
                }
            }
        }
        if (count >=1) {
            System.out.println("\nNumber of distinct triplets: " + count);
        }else {
            System.out.println("No Distinct Triplets found");
        }
    }
}
