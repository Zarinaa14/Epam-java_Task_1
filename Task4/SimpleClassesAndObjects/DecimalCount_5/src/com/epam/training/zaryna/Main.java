package com.epam.training.zaryna;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalCounter counter = new DecimalCounter();
        Info info = new Info();
        int choice = 1;

        while (choice != 0) {
            info.printInfo();

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1: {

                    System.out.println("Введите значение:");
                    if (scanner.hasNextInt()) {
                        counter.setCounter(scanner.nextInt());
                    }
                    break;
                }

                case 2: {

                    for (int i = 0; i < 10; i++, counter.increase()) {
                        System.out.print(counter.getCounter() + " ");
                    }
                    break;
                }

                case 3: {

                    for (int i = 0; i < 10; i++, counter.decrease()) {
                        System.out.print(counter.getCounter() + " ");
                    }
                    break;
                }

                case 4: {

                    System.out.println("Введите значение:");
                    if (scanner.hasNextInt()) {
                        counter.increase(scanner.nextInt());
                    }
                    break;
                }

                case 5: {

                    System.out.println("Введите значение:");
                    if (scanner.hasNextInt()) {
                        counter.decrease(scanner.nextInt());
                    }
                    break;
                }

                case 6: {

                    System.out.println(counter.getCounter());
                    break;
                }
            }
        }

    }
}