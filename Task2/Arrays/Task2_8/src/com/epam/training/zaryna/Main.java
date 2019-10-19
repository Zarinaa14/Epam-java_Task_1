package com.epam.training.zaryna;

import java.util.*;

/**
 * Дана последовательность целых чисел (a_1,a_2...a_n)   .
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны  min(a_1,a_2...a_n).
 */
public class Main {

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] deleteElementFromArr(int min, int[] arr) {
        int[] result = new int[arr.length - 1];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == min) {
                for (int i = j; i < arr.length - 1; i++) {
                    result[i] = arr[i + 1];
                }
                break;
            }
            result[j] = arr[j];
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Searched for in the array:");
        printArray(array);

        int min = minOfArray(array);
        System.out.println("Min:  " + min);
        array = deleteElementFromArr(min, array);
        System.out.println("After delete Element");
        printArray(array);
    }
}
