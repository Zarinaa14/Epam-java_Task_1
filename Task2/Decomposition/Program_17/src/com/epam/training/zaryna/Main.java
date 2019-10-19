package com.epam.training.zaryna;

import java.util.*;

//7. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Main {

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    //сколько раз из числа надо вычесть сумму его цифр, чтобы число стало равным 0
    public static int changeZero(int num) {
        int times = 0;

        while (num > 0) {
            num -= sumOfDigits(num);
            times++;
        }

        return times;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer!:");
        int number = in.nextInt();
        while (number <= 0) {
            System.out.println("Enter a positive integer!");
            number = in.nextInt();
        }

        System.out.println("\nНадо вычесть " + changeZero(number) + " раз.");

    }
}