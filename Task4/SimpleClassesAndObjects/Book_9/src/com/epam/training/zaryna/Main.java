package com.epam.training.zaryna;
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookArray bookArray = new BookArray();
        BookAction action =new BookAction();

        bookArray=action.generateRandomBooks(8);
        bookArray.print();
        Info info = new Info();
        int choice = 1;
        while (choice != 5) {
            Scanner scanner = new Scanner(System.in);
            info.printInfo();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Задайте год (2000-2019): \n");
                int year = scanner.nextInt();
                System.out.println("Больше заданного года : ");
                BookArray newBookArray = new BookArray();
                newBookArray=action.getPublishYear(bookArray,year);
                newBookArray.print();
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 2) {
                System.out.println("Задайте автора: \n");
                String author = scanner.next();
                System.out.println("Данные по заданному автору: ");
                BookArray newBookArray = new BookArray();
                newBookArray=action.getBooksOfAuthor(bookArray,author);
                bookArray.print();
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 3) {
                System.out.println("Задайте издательство : \n");
                String publishing = scanner.next();
                System.out.println("Данные по заданному издательству: ");
                BookArray newBookArray = new BookArray();
                newBookArray =action.getBooksOfPublish(bookArray,publishing);
                bookArray.print();
                System.out.println("--------------------------------------\n");
                continue;
            }

        }
    }
}
