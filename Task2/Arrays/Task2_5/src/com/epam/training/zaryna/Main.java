package com.epam.training.zaryna;

import java.util.Scanner;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Main {
    public static double[] createArray(int size) {
        double array[] = new double[size];
        return array;
    }

    public static void sort(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print("  " + array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scanner.nextInt();
        if (size > 0) {
            double array[] = createArray(size);
            System.out.println("Insert array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Numbers for which а_i > i");
            sort(array);

        }
    }
}