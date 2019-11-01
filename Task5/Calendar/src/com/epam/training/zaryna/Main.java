package com.epam.training.zaryna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Scanner scanner = new Scanner(System.in);
        Info info =new Info();
        int choice = 1;

        while (choice != 0) {
            info.startInfo();
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("\n Введите год: ");
                    int year=scanner.nextInt();
                    System.out.println("\n Введите месяц: ");
                    int month=scanner.nextInt();
                    System.out.println("\n Введите день: ");
                    int day=scanner.nextInt();
                    calendar.addDate(year, month, day);
                    break;
                }

                case 2: {
                    System.out.println("\n Введите год: ");
                    int year=scanner.nextInt();
                    System.out.println("\n Введите месяц: ");
                    int month=scanner.nextInt();
                    System.out.println("\n Введите день: ");
                    int day=scanner.nextInt();
                    calendar.addDayOff(year, month, day);
                    break;
                }

                case 3: {
                    System.out.println("\n Введите год: ");
                    int year=scanner.nextInt();
                    System.out.println("\n Введите месяц: ");
                    int month=scanner.nextInt();
                    System.out.println("\n Введите день: ");
                    int day=scanner.nextInt();
                    System.out.println("\n Введите название праздника: ");
                    String name=scanner.nextLine();
                    calendar.addHoliday(name, year, month, day);
                    break;
                }

                case 4: {
                    System.out.println("\nВведите номер для удаления: ");
                    calendar.deleteDate(scanner.nextInt() - 1);
                    break;
                }

                case 6: {
                    calendar.print();
                    break;
                }
            }
        }
    }

}

