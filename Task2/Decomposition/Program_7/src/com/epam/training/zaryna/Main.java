package com.epam.training.zaryna;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Main {

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int sumOfFactorial_9(int startOfMerge, int endOfMerge) {
        int sum = 0;
        if (startOfMerge % 2 == 0) {
            startOfMerge++;
        }
        for (int i = startOfMerge; i <= endOfMerge; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of factorials from 1 to 9 = " + sumOfFactorial_9(1, 9));
    }
}