package com.epam.training.zaryna;

// Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class Main {
    private static int[][] generateMatrix(int lines, int columns) {
        System.out.println("\nThe generated matrix is: ");
        int arr[][] = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + "  ");
            }
        }
        return arr;
    }

    private static void ifLinesEqual_5_More_than3Times(int lines, int columns, int[][] arr) {

        for (int i = 0; i < lines; i++) {
            int number_5 = 0;
            for (int j = 0; j < columns; j++) {

                if (arr[i][j] == 5) {
                    number_5++;
                }
                if (number_5 >= 3) {
                    j = 0;
                    int line_number5 = i + 1;
                    System.out.println("\nLine number is " + line_number5 + "; ");
                    for (int k = j; k < columns; k++) {
                        System.out.print(arr[i][j] + "; ");
                        j++;
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\n " + arr[i][j] + "; " + "i= " + i + " j= " + j + "; ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixLines = 10;
        int matrixColumns = 20;
        int[][] matrix = generateMatrix(matrixLines, matrixColumns);
        ifLinesEqual_5_More_than3Times(matrixLines, matrixColumns, matrix);
        //int [][] twoDimArray = {{5,5,5,17}, {7,0,1,12}, {8,1,2,3},{9,5,3,3},{9,5,5,5}};
        //ifLinesEqual_5_More_than3Times(5,4,twoDimArray);
        // printMatrix(twoDimArray);

    }
}
