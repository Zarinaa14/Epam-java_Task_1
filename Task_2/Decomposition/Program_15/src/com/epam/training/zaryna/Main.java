package com.epam.training.zaryna;

import java.util.*;
import java.lang.*;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberAction action = new NumberAction();
        System.out.println("Введите некоторое натуральное число:");
        int k = input.nextInt();
        if (k > 0) {
            action.printNumbersWithIncSequence(k);
        } else System.out.println("Enter more than zero!");
    }
}