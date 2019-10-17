package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayBank arrayOfBankAccount = new ArrayBank(10);
        String[] arrayOfName = new String[]{"Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "Elena"};
        int[] arrayOfBalance = new int[]{23, -456, 789, 87, 178, 908, -654, 65, 765, 321};
        arrayOfBankAccount.getRandomBankAccounts(arrayOfName, arrayOfBalance);
        arrayOfBankAccount.print();
        System.out.println("__________________________");
        Info info = new Info();
        int choice = 1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            info.printInfo();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Банковские счета отсортированы по балансу: \n");
                arrayOfBankAccount.sortByBalance();
                arrayOfBankAccount.print();
                continue;
            }
            if (choice == 2) {
                System.out.println("Задайте имя: \n");
                String name = scanner.next();
                System.out.println("Информация по заданному имени");
                arrayOfBankAccount.findCustomerByNameAndBalance(name);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 3) {
                System.out.println("Сортировка имени по алфавиту,если имена счетов совпадают, то сортируется по балансу: \n");
                arrayOfBankAccount.sortByNameOfCustomer();
                arrayOfBankAccount.print();
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 4) {
                System.out.println("Задайте номер счета : \n");
                int index = scanner.nextInt();
                arrayOfBankAccount.block(index);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 5) {
                System.out.println("Задайте номер счета: \n");
                int index = scanner.nextInt();
                arrayOfBankAccount.unlock(index);
                System.out.println("--------------------------------------\n");
                continue;
            }

            if (choice == 6) {
                System.out.println("Задайте номер счета: \n");
                int index = scanner.nextInt();
                System.out.println("Задайте количество денег: \n");
                double money = scanner.nextDouble();
                if (money > 0) {
                    arrayOfBankAccount.depositMoney(money, index);
                    System.out.println("--------------------------------------\n");
                } else System.out.println("Введите больше 0");
                continue;
            }
            if (choice == 7) {
                System.out.println("Задайте номер счета: \n");
                int index = scanner.nextInt();
                System.out.println("Задайте количество денег: \n");
                double money = scanner.nextDouble();
                if (money > 0) {
                    arrayOfBankAccount.withdrawMoney(money, index);
                    System.out.println("--------------------------------------\n");
                } else System.out.println("Введите больше 0");
                continue;
            }
            if (choice == 8) {
                System.out.println("Задайте имя: \n");
                String name = scanner.next();
                System.out.println("Задайте депозит: \n");
                double money = scanner.nextDouble();
                arrayOfBankAccount.addBankAccount(name, money);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 9) {
                System.out.println("Задайте имя: \n");
                String name = scanner.next();
                arrayOfBankAccount.deleteBankAccountByName(name);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 10) {
                System.out.println("Задайте депозит: \n");
                double balance = scanner.nextDouble();
                arrayOfBankAccount.findCustomerBalance(balance);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 11) {
                double result = arrayOfBankAccount.getTotalPositiveBalance();
                System.out.println("Положительный баланс, дебет: \n" + result);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 12) {
                double result = arrayOfBankAccount.getTotalNegativeBalance();
                System.out.println("Отрицательный баланс, кредит: \n" + result);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 13) {
                double result = arrayOfBankAccount.getTotalBalance();
                System.out.println("Общий баланс:" + result);
                System.out.println("--------------------------------------\n");
            }
            if (choice == 14) {
                System.out.println("Заблокировать все счета: \n");
                arrayOfBankAccount.blockAllBankAccounts();
                System.out.println("Счета заблокированы!\n");
            }
            if (choice == 15) {
                System.out.println("Разблокировать все счета: \n");
                arrayOfBankAccount.unlockAll();
                System.out.println("Счета разблокированы!\n");
            }
            if (choice == 16) {
                System.out.println("Задайте имя клиента: \n");
                String name = scanner.next();
                System.out.println("Задайте баланс клиента: \n");
                double balance = scanner.nextDouble();
                arrayOfBankAccount.block(name, balance);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 17) {
                System.out.println("--------------------------------------\n");
                arrayOfBankAccount.print();
                System.out.println("--------------------------------------\n");
            }
        }

    }
}
