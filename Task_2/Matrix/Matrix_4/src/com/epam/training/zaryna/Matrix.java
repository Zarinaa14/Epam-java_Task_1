package com.epam.training.zaryna;

import java.util.Scanner;

/**
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *    1   2   3 ... n
 *    n  n-1 n-2...1
 *    1  2  3 ... n
 *    n n-1 n-2...1
 *    .............
 *    n n-1 n-2...1
 */
public class Matrix {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the matrix order(even):");
        int numberOfLines = in.nextInt();

        if (numberOfLines > 0) {

            if (numberOfLines % 2 == 1) {
                System.out.println("\n An odd number is entered, the size will be increased to an even number!");
                numberOfLines++;
            }

            System.out.println("\n Matrix :");
            int arr[][] = new int[numberOfLines][numberOfLines];
            for (int i = 0; i < numberOfLines; i++) {
                for (int j = 0; j < numberOfLines; j++) {
                    if (i % 2 == 0) {
                        arr[i][j] = 1 + j;
                    } else {
                        arr[i][j] = numberOfLines - j;
                    }
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

    }
}
