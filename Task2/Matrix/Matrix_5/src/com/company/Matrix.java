package com.company;

import java.util.Scanner;

/**
 * Формирует матрицу по шаблону
 * 1 2 3 ... n
 * n n-1 n-2...1
 * 1 2 3 ... n
 * n n-1 n-2...1
 * .............
 * n n-1 n-2...1
 **/
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the matrix order(even):");
        int num = in.nextInt();

        if (num > 0) {

            if (num % 2 == 1) {
                System.out.println("\nAn odd number is entered, the size will be increased to an even number!");
                num++;
            }

            System.out.println("\nThe matrix constructed by the formula:");
            int arr[][] = new int[num][num];
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i % 2 == 0) {
                        arr[i][j] = 1 + j;
                    } else {
                        arr[i][j] = num - j;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}