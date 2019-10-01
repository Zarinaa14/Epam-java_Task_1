package com.company;
// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
public class Matrix {
    private static void MatrixAfterSort( int [][] arr){
        for (int i = 0; i < 3; i++) {  //идём по строкам
            if (i % 2 == 0 && arr[0][i] > arr[arr.length - 1][i]) {
                for (int j = 0; j < 4; j++) {//идём по столбцам
                    System.out.print(" " + arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    private static void PrintMatrix( int [][] arr){
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + arr[i][j] + "; ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        System.out.println("Matrix: ");
        PrintMatrix(twoDimArray);
        System.out.println("Matrix after sorting:  ");
        MatrixAfterSort(twoDimArray);
    }
}


