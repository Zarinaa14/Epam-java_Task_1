package com.epam.training.zaryna;
import java.util.Scanner;
/**
 * Найдите  значение функции:  z = ( (a – 3 ) * b / 2) + c.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Поиск значения функции: z = ( (a – 3 ) * b / 2) + c = ");
        Scanner in = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = in.nextDouble();

        System.out.print("Введите b: ");
        double b = in.nextDouble();

        System.out.print("Введите c: ");
        double c = in.nextDouble();

        double z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции:  z = ( (a – 3 ) * b / 2) + c = " + z);
        in.close();
    }
}
