package com.epam.training.zaryna;

import java.util.Scanner;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Main {
    public static double[] createArray(int size) {
        double array[] = new double[size];
        return array;
    }

    public static double[] createSequence(double[] array, double geometricConstant) {
        for (int m = 0; m < array.length; m++) {
            array[m] += m * geometricConstant;
            System.out.print(array[m] + "; ");
        }
        return array;
    }

    public static void printArray(double[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += array[i] + "; ";
        }
        System.out.println(string);
    }

    public static double[] createArrayOfReplacements(int number, double[] array, double z) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                number++;
                array[i] = z;
            }
        }
        return array;
    }

    public static int numberOfReplacements(int number, double[] array, double z) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива : ");
        int size = sc.nextInt();
        if (size > 0) {
            double array[] = createArray(size);
            System.out.println("Введите геометрическую постоянную : ");
            double geometricConstant = sc.nextDouble();
            System.out.println("Полученная последовательность : ");
            createSequence(array, geometricConstant);
            System.out.println("\nВведите число Z: \nвсе ее члены, большие данного Z, заменяются данным числом: ");
            double z = sc.nextDouble();
            int numberOfReplacements = 0;
            numberOfReplacements = numberOfReplacements(numberOfReplacements, array, z);
            double[] newArray = createArrayOfReplacements(numberOfReplacements, array, z);
            System.out.println("Число замен: " + numberOfReplacements);
            System.out.println("Массив после замены:");
            printArray(newArray);
        } else {
            System.out.println("Введите длину массива больше нуля!");
        }
    }
}
