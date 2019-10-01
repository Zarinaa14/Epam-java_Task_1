package com.company;
// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
public class Main {
    private static void printMatrix( int [][] arr){
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + arr[i][j] + "; ");
            }
            System.out.println();
        }
    }
    public static void printDiag(int[][] arr) {
        System.out.println("Главная диагональ:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println("\n Побочная диагональ:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][arr.length-1-i]+" ");
        }
    }

    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3},{9,5,3,3}};
        System.out.println("Matrix: ");
        printMatrix(twoDimArray);
        printDiag(twoDimArray);

    }
}
