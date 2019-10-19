package com.epam.training.zaryna;

import java.util.*;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Main {

    private static int secondLargest(int[] arr) {

        int max_number = arr[0];
        int second_number = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_number) {
                second_number = max_number;
                max_number = arr[i];
            } else {
                if ((arr[i] < max_number && arr[i] > second_number) || max_number == second_number) {
                    second_number = arr[i];
                }
            }
        }

        return second_number;
    }

    private static void generateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 51);
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int size = in.nextInt();

        if (size > 0) {
            int[] array = new int[size];
            generateArray(array);

            System.out.println("Cгенерированный массив:");
            printArray(array);

            try {
                System.out.println("\nВторое по величине число = " + secondLargest(array));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            System.out.println("Размер массива должен быть положителен!");
        }
    }
}
