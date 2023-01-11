package com.bridgelabz.day5functional;

import java.util.Scanner;

public class Array2D {
    static int i, j, row, column;
    int[][] arr;
    static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter row and column range: ");
        row = s1.nextInt();
        column = s1.nextInt();
        System.out.println("Enter type of the array:for\ninteger: 1\ndouble: 2\nboolean: 3");
        int num = s1.nextInt();
        System.out.println("Enter array elements: ");

        if (num == 1) {
            arrayInteger();
        }else if (num == 2) {
            arrayDouble();
        }else {
            arrayBoolean();
        }
    }

    static void arrayInteger() {
        int[][] arr = new int[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                arr[i][j] = s1.nextInt();
            }}
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }}

    static void arrayDouble() {
        double[][] arr = new double[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                arr[i][j] = s1.nextDouble();
            }}
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }}
    static void arrayBoolean() {
        boolean[][] arr = new boolean[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                arr[i][j] = s1.nextBoolean();
            }}
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }}
}
