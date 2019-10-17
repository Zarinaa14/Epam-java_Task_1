package com.company;
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookArray bookArray = new BookArray(10);
        String[] arrayOfAuthor = new String[]{"Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "Elena"};
        String[] arrayOfName = new String[]{"War and Peace", "The Gambler", "The Master and Margarita", "And Quite Flows the Don", "A Hero of Our Time", "Marvel", "Sun goes round"};
        String[] arrayTypeOfBinding = new String[]{"binding 7B", "integral", "french", "wrapped on the bolts", "metalBind", "premium", "insertion"};
        String[] arrayOfPublishing = new String[]{"A", "B", "C", "D", "R", "F", "H"};
        int[] arrayOfYearsPublishing = new int[]{2009, 2019, 2008, 2007, 2004, 2002, 2001, 2000, 2018, 2015};
        int[] arrayOfNumberPage = new int[]{671, 455, 536, 655, 785, 815, 534, 444, 5543, 92};
        int[] arrayOfPrice = new int[]{24, 45, 53, 65, 78, 81, 53, 44, 55, 92};
        bookArray.runBook(arrayOfName, arrayOfAuthor, arrayOfPublishing, arrayTypeOfBinding, arrayOfNumberPage, arrayOfPrice, arrayOfYearsPublishing);
        bookArray.print();
        Info info =new Info();
        int choice = 1;
        while (choice != 5) {
            Scanner scanner = new Scanner(System.in);
           info.printInfo();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Задайте год (2000-2019): \n");
                int year = scanner.nextInt();
                System.out.println("Больше заданного года : ");
                bookArray.getPublish_year(year);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 2) {
                System.out.println("Задайте автора: \n");
                String author = scanner.next();
                System.out.println("Данные по заданному автору: ");
                bookArray.getBooksOfAuthor(author);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 3) {
                System.out.println("Задайте издательство : \n");
                String publishing = scanner.next();
                System.out.println("Данные по заданному издательству: ");
                bookArray.getBooksOfPublish(publishing);
                System.out.println("--------------------------------------\n");
                continue;
            }

        }
    }
}
