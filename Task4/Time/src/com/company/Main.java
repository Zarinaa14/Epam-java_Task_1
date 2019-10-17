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
        Info info =new Info();
        while (0 < choice && 9 > choice) {
            info.printInfo();
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
