package com.company;

import java.util.*;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

public class Main {

    private static void printMatrix(double[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    private static void MatrixRandom(double[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=Math.random()*101-51;
                arr[i][j]=(double)Math.round(arr[i][j]*100d)/100d;
            }
        }
    }

    private static void sortAscending(double[][] arr){
        double temp;

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length-1;j++){
                for(int k=0;k<arr.length-j-1;k++){
                    if(arr[k][i]>arr[k+1][i]){
                        temp=arr[k][i];
                        arr[k][i]=arr[k+1][i];
                        arr[k+1][i]=temp;
                    }
                }
            }
        }
    }

    private static void sortDescending(double[][] arr){
        double temp;

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length-1;j++){
                for(int k=0;k<arr.length-j-1;k++){
                    if(arr[k][i]>arr[k+1][i]){
                        temp=arr[k][i];
                        arr[k][i]=arr[k+1][i];
                        arr[k+1][i]=temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter lines ");
            int lines = in.nextInt();
            System.out.println("Enter columns ");
            int column = in.nextInt();

            if(column>0 && lines>0) {
                double arr[][] = new double[lines][column];

                MatrixRandom(arr);
                System.out.println("\nMatrix: ");
                printMatrix(arr);

                sortAscending(arr);
                System.out.println("\nColumns are sorted in ascending order: ");
                printMatrix(arr);

                sortDescending(arr);
                System.out.println("\nColumns are sorted in descending order: ");
                printMatrix(arr);

            }else{
                System.out.println("matrix must be semi-positive!");
            }

    }
}