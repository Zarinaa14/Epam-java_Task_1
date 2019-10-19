package com.epam.training.zaryna;

/**
 * Задание 1 (циклы). Напишите программу, где пользователь вводит любое целое положительное число.
 * программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number:  ");
        int x = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= x; i++) {
            k += i;
        }
        System.out.println("Sum of numbers from one is " + k);
        sc.close();
    }
}
