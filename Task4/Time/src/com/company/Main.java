package com.company;
// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
// с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Time time = new Time();
        int choice = 1;
        while (0 < choice && 9 > choice) {
            System.out.println("\nВведите 0 для прекращения работы.\nВведите 1 для того, чтобы установить время при помощи строки.\n" +
                    "Введите 2, чтобы установить часы.\nВведите 3, чтобы установить минуты\nВведите 4, чтобы установить секунды\n" +
                    "Введите 5, чтобы прибавить часы.\nВведите 6, чтобы прибавить минуты.\nВведите 7, чтобы прибавить секунды\nВведите 8, чтобы вывести время\n");


            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("\nВведите часы:");
                int hours = in.nextInt();
                System.out.println("\nВведите минуты:");
                int minutes = in.nextInt();
                System.out.println("\nВведите секунды:");
                int seconds = in.nextInt();
                time.setTime(hours, minutes, seconds);
                continue;
            }

            if (choice == 2) {
                System.out.println("\nВведите часы:");
                time.setHours(in.nextInt());
                continue;
            }

            if (choice == 3) {
                System.out.println("\nВведите минуты:");
                time.setMinutes(in.nextInt());
                continue;
            }

            if (choice == 4) {
                System.out.println("\nВведите секунды:");
                time.setSeconds(in.nextInt());
                continue;
            }

            if (choice == 5) {
                System.out.println("\nВведите часы:");
                time.addHours(in.nextInt());
                continue;
            }

            if (choice == 6) {
                System.out.println("\nВведите минуты:");
                time.addMinutes(in.nextInt());
                continue;
            }

            if (choice == 7) {
                System.out.println("\nВведите секунды:");
                time.addSeconds(in.nextInt());
                continue;
            }

            if (choice == 8) {
                System.out.println(time);
                continue;
            }
        }
    }
}
