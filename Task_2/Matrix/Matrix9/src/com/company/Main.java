package com.company;
//Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму
public class Main {
    private static void printMatrix( int [][] arr){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + arr[i][j] + "; ");
            }
            System.out.println();
        }
    }
    private static void currSumofColumns(int [][] arr){
        for (int i = 0; i < 4; i++) {
            int currSum = 0;
            for (int j = 0; j < 4; j++) {
                 currSum += arr[j][i];
            }
            System.out.print(" currSum: "+currSum);
        }
    }
    private static int maxSumOfColumns(int [][] arr){
        int maxSumOfColumns = 0;
        int currSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currSum += arr[j][i];
            }

            if (currSum > maxSumOfColumns) {
                maxSumOfColumns = currSum;
            }
            currSum = 0;
        }
        return maxSumOfColumns;
    }
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{9,5,3,3}};
        System.out.println("Matrix: ");
        printMatrix(twoDimArray);
        int max = maxSumOfColumns(twoDimArray);
        System.out.println("Matrix: "+ max);
        currSumofColumns(twoDimArray);
    }
}
