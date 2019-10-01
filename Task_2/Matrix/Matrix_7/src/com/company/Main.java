package com.company;
import java.util.Scanner;

/*
    Формирует матрицу порядка N по правилу:
        A[i,j]=sin( (i^2-j^2)/N) )
    и считает число положительных элементов в ней
 */

public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter the matrix order(even): ");
            int n = in.nextInt();

            if (n > 0) {
                int numOfPositive = 0;

                System.out.println("\nMatrix:");
                double arr[][] = new double[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = Math.floor(Math.sin((i * i - j * j) / ((double) n)) * 1000 + .5) / 1000;
                        if (arr[i][j] > 0) {
                            numOfPositive++;
                        }
                        System.out.print(arr[i][j] + "  ");
                    }
                    System.out.print("\n");
                }

                System.out.println("\nNumber of positive elements: " + numOfPositive);

            }
        }
}
