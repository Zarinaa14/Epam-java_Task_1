package com.epam.training.zaryna;

import java.util.*;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */
public class Main {

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void matrixRandom(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.floor(Math.random() * 100 - 50);
            }
        }
    }

    public static void changeColumns(int[][] arr, int col1, int col2) {
        if (col1 > arr[0].length || col2 > arr[0].length || col1 <= 0 || col2 <= 0) {
            System.out.println("Incorrect column numbers!");
        }

        int tpm;

        for (int i = 0; i < arr.length; i++) {
            tpm = arr[i][col1 - 1];
            arr[i][col1 - 1] = arr[i][col2 - 1];
            arr[i][col2 - 1] = tpm;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of lines (строки матрицы):");
        int lines = in.nextInt();
        System.out.println("Enter the number of columns (строки матрицы):");
        int columns = in.nextInt();

        if (lines > 0 && columns > 0) {
            int matrix[][] = new int[lines][columns];
            matrixRandom(matrix);

            System.out.println("\nMatrix: ");
            printMatrix(matrix);

            System.out.println("Enter the column numbers you want to change:");
            int column_1 = in.nextInt();
            int column_2 = in.nextInt();


            changeColumns(matrix, column_1, column_2);

            System.out.println("\nMatrix after change:");
            printMatrix(matrix);

        } else {
            System.out.println("Enter numbers greater than 0: ");
        }

    }

}