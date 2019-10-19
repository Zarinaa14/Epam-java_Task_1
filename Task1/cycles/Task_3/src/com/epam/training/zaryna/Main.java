package com.epam.training.zaryna;

/**
 * 3. Найти сумму квадратов первых ста чисел.
 */
public class Main {

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            k += i * i;
        }
        System.out.println("сумма квадратов первых ста чисел равна: " + k);
    }
}
