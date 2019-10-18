package com.epam.training.zaryna;

import java.util.Scanner;

/**
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Main {
    public static double[] createArray(int size) {
        double array[] = new double[size];
        return array;
    }

    public static int calculatePositiveNumber(double[] array) {
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            }
        }
        return countPositive;
    }

    public static int calculateNegativeNumber(double[] array) {
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative++;
            }
        }
        return countNegative;
    }

    public static int calculateZeroNumber(double[] array) {
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZero++;
            }
        }
        return countZero;
    }


    public static void printArray(double[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + "; ";
        }
        System.out.println(string);
    }

    public static void printTypeNumber(int a, int b, int c) {
        System.out.println("Positive number: " + a);
        System.out.println("Zero numbers: " + c);
        System.out.println("Negative number: " + b);
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
            int countPositiveNumber = calculatePositiveNumber(array);
            int countNegativeNumber = calculateNegativeNumber(array);
            int countZeroNumber = calculateZeroNumber(array);
            printArray(array);
            printTypeNumber(countPositiveNumber, countNegativeNumber, countZeroNumber);
        } else {
            System.out.println("Введите больше нуля");
        }
    }
}
