package com.epam.training.zaryna;
/**
 * Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Main {
    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + arr[i][j] + "; ");
            }
            System.out.println();
        }
    }

    private static void printPositivefMainDiagonal(int[][] arr) {
        System.out.println("Main diagonal :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.print(arr[i][i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] twoDimArray = {{-5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {9, 5, 3, 3}};
        System.out.println("Matrix: ");
        printMatrix(twoDimArray);
        printPositivefMainDiagonal(twoDimArray);

    }
}
