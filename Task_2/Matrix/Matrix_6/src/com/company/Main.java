package com.company;

import java.util.Scanner;

/**
    Формирует матрицу по шаблону
        1 1 1 ... 1 1 1
        0 1 1 ... 1 1 0
        0 0 1 ... 1 0 0
        ...............
        0 1 1 ... 1 1 0
        1 1 1 ... 1 1 1
 **/

public class Main {


    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the matrix order(even)::");
            int num= in.nextInt();

            if(num>0) {

                if (num % 2 == 1) {
                    System.out.println("\nВведено нечетное число, размер будет увеличен до четного!");
                    num++;
                }

                System.out.println("\nМатрица, построенная по шаблону:");
                int arr[][] = new int[num][num];
                for (int i = 0; i < num; i++) {

                    for (int j = 0; j < num; j++) {

                        if (i < num / 2) {
                            if (j < i || j > num - i - 1) {
                                arr[i][j] = 0;
                            }
                            else {
                                arr[i][j] = 1;
                            }
                        } else {
                            arr[i][j] = arr[num - i - 1][j];
                        }
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
    }
}
