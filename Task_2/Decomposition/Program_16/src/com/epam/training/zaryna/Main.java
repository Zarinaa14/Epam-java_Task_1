package com.epam.training.zaryna;

import java.util.*;
import java.lang.*;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
class Main {
    private static int size(int number) {
        int size = 0;
        while (number > 0) {
            size++;
            number /= 10;
        }
        return size;
    }

    //возращает массив цифр из числа
    private static int[] generateArrayOfDigits(int number, int size) {
        int arr[] = new int[size];
        int curNum;
        int i = 0;
        while (number != 0) {
            curNum = number % 10;
            //  System.out.print(curNum); System.out.print("; ");
            arr[i] = curNum;
            number /= 10;
            i++;
        }
        return arr;
    }

    public static void printNumbersWithIncSequence(int n) {
        int startNum = (int) Math.pow(10, n - 1);
        int endNum = (int) Math.pow(10, n) - 1;

        System.out.println("\n" + n + "-значные числа, цифры которых образуют возрастающую последовательность: ");

        for (int i = startNum; i <= endNum; i++) {
            int[] arr = generateArrayOfDigits(i, size(i));
            if (isAllDigitsUneven(arr)) {
                System.out.print(i + " ");
            }
        }
    }


    private static boolean isAllDigitsUneven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите некоторое натуральное число:");
        try {
            int k = input.nextInt();

            if (k > 0) {
                printNumbersWithIncSequence(k);
            } else {
                System.out.println("Enter more than zero!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Write number!");
        }
    }
}