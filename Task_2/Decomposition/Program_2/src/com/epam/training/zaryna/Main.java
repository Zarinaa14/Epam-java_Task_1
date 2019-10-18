package com.epam.training.zaryna;

import java.util.*;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Main {

    private static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

    private static int gcd(int first, int second, int third, int fourth) {
        int gcd = greatestCommonDivisor(first, second);
        gcd = greatestCommonDivisor(gcd, third);
        gcd = greatestCommonDivisor(gcd, fourth);
        return gcd;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        System.out.println("Наибольший общий делитель(" + num1 + "," + num2 + "," + num3 + "," + num4 + ") = "
                + gcd(num1, num2, num3, num4));

    }
}