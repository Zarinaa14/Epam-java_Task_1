package com.epam.training.zaryna;

import java.util.*;
/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Main {
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void MatrixRandom(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 205 - 55);
            }
        }
    }

    public static void printLineAndColumn(int[][] arr, int outLine, int outColumn) {

        System.out.println("\nCтрока: ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(arr[outLine - 1][i] + " ");
        }

        System.out.println("\n\nСтолбец:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][outColumn - 1]);
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int numOfLines = in.nextInt();
        int numOfColumn = in.nextInt();

        int arr[][] = new int[numOfLines][numOfColumn];

        if (numOfColumn > 0 && numOfLines > 0) {
            MatrixRandom(arr);

            System.out.println("\nMatrix: ");
            printMatrix(arr);

            System.out.println("Enter the number of the row and column you want to display:");
            int outLine = in.nextInt();
            int outColumn = in.nextInt();
            printLineAndColumn(arr, outLine, outColumn);

        }
    }
}
