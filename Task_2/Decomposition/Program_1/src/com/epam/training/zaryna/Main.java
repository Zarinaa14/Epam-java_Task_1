package com.epam.training.zaryna;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
public class Main {

    private static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }

    private static int leastCommonMultiply(int a, int b) {
        return a / greatestCommonDivisor(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int number_1 = in.nextInt();
        int number_2 = in.nextInt();
        System.out.println("Наибольший общий делитель[" + number_1 + "," + number_2 + "] = " + greatestCommonDivisor(number_1, number_2));
        System.out.println("Наименьшее общее кратное[" + number_1 + "," + number_2 + "] = " + leastCommonMultiply(number_1, number_2));

    }
}