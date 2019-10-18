package com.company.epam.zaryna.training;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * // (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/ (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) ∗ 𝑡𝑔 𝑥𝑦
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Значение функции (sin(x)+cos(x))/(cos(x)-sin(x))*tg(xy)");
        Scanner in = new Scanner(System.in);
        double x, y, z;
        System.out.println("Введите x: ");
        x = in.nextDouble();
        System.out.println("Введите y: ");
        y = in.nextDouble();
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("Значение функции (sin(x)+cos(x))/(cos(x)-sin(x))*tg(xy)=", z);
        in.close();
    }
}
