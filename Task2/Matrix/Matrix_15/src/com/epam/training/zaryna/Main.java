package com.epam.training.zaryna;

import java.util.*;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
public class Main {

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static void matrixRandom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 101 - 51);
            }
        }
    }

    private static int getMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    private static void changeAllOdd(int[][] matrix, int number) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 1 || matrix[i][j] % 2 == -1) {
                    matrix[i][j] = number;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix");
        int numOfLines = in.nextInt();
        int numOfColumn = in.nextInt();

        if (numOfColumn > 0 && numOfLines > 0) {
            int arr[][] = new int[numOfLines][numOfColumn];
            matrixRandom(arr);

            System.out.println("\nMAtrix: ");
            printMatrix(arr);

            System.out.println("\nChange max:");
            int max = getMax(arr);
            changeAllOdd(arr, max);
            printMatrix(arr);

        } else {
            System.out.println("matrix must be semi-positive!");
        }
    }
}