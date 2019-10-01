package com.company;


import java.util.*;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class Main {

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    private static void generateMatrix(int numOfColumn,int numOfLines){
         if(numOfColumn>0 && numOfLines>0) {
            int arr[][] = new int[numOfLines][numOfColumn];
            if (numOfColumn <= numOfLines) {
                int numOf1;
                int indexOfLine;//Индекс строки, генерируемый случайно, в котором должна размещаться одна из 1 столбца
                for (int i = 0; i < numOfColumn; i++) {
                    numOf1 = i + 1;

                    while (numOf1 != 0) {
                        indexOfLine = (int) (Math.random() * numOfLines);

                        if (arr[indexOfLine][i] == 0) {
                            arr[indexOfLine][i] = 1;
                            numOf1--;
                        }
                    }
                }

                System.out.println("\nGenerate matrix: ");
                printMatrix(arr);

            } else {
                System.out.println("There can not be a matrix in which the number 1 in the column is equal to the number of the column!");
            }

        } else{
            System.out.println("matrix must be semi-positive!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lines ");
        int lines = in.nextInt();
        System.out.println("Enter columns ");
        int column = in.nextInt();
        generateMatrix(column,lines);
    }
}
