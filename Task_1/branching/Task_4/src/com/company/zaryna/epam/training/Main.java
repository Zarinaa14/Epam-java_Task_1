package com.company.zaryna.epam.training;

import java.util.Scanner;

/**
 * Задание 4. (ветвления. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a side of hole A:");
        int a = sc.nextInt();
        System.out.println("Enter a side of hole B:");
        int b = sc.nextInt();

        System.out.println("Enter a side of brick x:");
        int x = sc.nextInt();
        System.out.println("Enter a side of brick y:");
        int y = sc.nextInt();
        System.out.println("Enter a side of brick z:");
        int z = sc.nextInt();

        if (a >= y && b >= x || a >= x && b >= y) {
            System.out.println("The brick is passed ");
        } else {
            System.out.println("The brick is not passed ");
        }

        sc.close();
    }
}
