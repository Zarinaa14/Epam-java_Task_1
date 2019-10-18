package com.company.epam.training.zaryna;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑏 + √𝑏^2 + 4𝑎𝑐 )/2𝑎 − 𝑎^3*𝑐 + 𝑏^(−2)
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf("Поиск значения функции b+(b^2+4ac)^(1/2)/2a-a^3*c+b^(-2) :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = sc.nextDouble();
        System.out.println("Введите b: ");
        double b = sc.nextDouble();
        System.out.println("Введите c: ");
        double c = sc.nextDouble();
        double z = Math.pow(b, 2) + 4 * a * c;
        double y = (b + Math.sqrt(z)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.printf("Поиск значения функции b+(b^2+4ac)^(1/2)/2a-a^3*c+b^(-2) = %f", y);
        sc.close();
    }
}
