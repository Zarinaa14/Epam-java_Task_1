package com.company;
import java.util.*;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class Main {

    public static void printMatrix(double[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void matrixRandom(double[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=Math.random()*101-51;
                matrix[i][j]=(double)Math.round(matrix[i][j]*100d)/100d;
            }
        }
    }

    public static void sortAscend(double[][] matrix){
        double temp;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                for(int k=0;k<matrix[0].length-j-1;k++){
                    if(matrix[i][k]>matrix[i][k+1]){
                        temp=matrix[i][k];
                        matrix[i][k]=matrix[i][k+1];
                        matrix[i][k+1]=temp;
                    }
                }
            }
        }
    }

    public static void sortDesk(double[][] matrix){
        double temp;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                for(int k=0;k<matrix[0].length-j-1;k++){
                    if(matrix[i][k]<matrix[i][k+1]){
                        temp=matrix[i][k];
                        matrix[i][k]=matrix[i][k+1];
                        matrix[i][k+1]=temp;
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

                matrixRandom(arr);
                System.out.println("\nMatrix: ");
                printMatrix(arr);

                sortAscend(arr);
                System.out.println("\nMatrix: ");
                printMatrix(arr);

                sortDesk(arr);
                System.out.println("\nThe rows are sorted in descending order: ");
                printMatrix(arr);

            }else{
                System.out.println("matrix must be semi-positive!");
            }
    }
}