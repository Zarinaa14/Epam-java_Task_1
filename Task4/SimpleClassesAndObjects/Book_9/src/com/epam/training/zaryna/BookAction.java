package com.epam.training.zaryna;

import java.util.Random;

public class BookAction {

    private String[] arrayOfAuthor = new String[]{"Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "Elena"};
    private String[] arrayOfName = new String[]{"War and Peace", "The Gambler", "The Master and Margarita", "And Quite Flows the Don", "A Hero of Our Time", "Marvel", "Sun goes round"};
    private String[] arrayTypeOfBinding = new String[]{"binding 7B", "integral", "french", "wrapped on the bolts", "metalBind", "premium", "insertion"};
    private String[] arrayOfPublishing = new String[]{"A", "B", "C", "D", "R", "F", "H"};
    private int[] arrayOfYearsPublishing = new int[]{2009, 2019, 2008, 2007, 2004, 2002, 2001, 2000, 2018, 2015};
    private int[] arrayOfNumberPage = new int[]{671, 455, 536, 655, 785, 815, 534, 444, 5543, 92};
    private int[] arrayOfPrice = new int[]{24, 45, 53, 65, 78, 81, 53, 44, 55, 92};

    public BookArray generateRandomBooks(int size) {
        Random random = new Random();
        BookArray arrayOfCustomers = new BookArray();
        Book[] boooks = new Book[size];
        for (int i = 0; i < size; i++) {

            boooks[i] = new Book(arrayOfName[random.nextInt(7)], arrayOfAuthor[random.nextInt(7)], arrayOfPublishing[random.nextInt(7)], arrayTypeOfBinding[random.nextInt(7)], arrayOfNumberPage[random.nextInt(7)], arrayOfPrice[random.nextInt(7)], arrayOfYearsPublishing[random.nextInt(7)]);
        }
        arrayOfCustomers.setBooks(boooks);
        return arrayOfCustomers;
    }

    public BookArray getBooksOfAuthor(BookArray bookArray, String author) {
        int countBook = 0;
        BookArray sortedArrayOfBook = new BookArray();
        if (bookArray == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }

        for (Book book : bookArray.getBooks()) {
            if (book.getAuthor().equals(author)) {
                countBook++;
            }
        }
        if (countBook > 0) {
            Book[] newBook = new Book[countBook];
            int i = 0;
            for (Book book : bookArray.getBooks()) {
                if (book.getAuthor().equals(author)) {
                    newBook[i] = book;
                    i++;
                }
            }
            sortedArrayOfBook.setBooks(newBook);
        }
        return sortedArrayOfBook;

    }

    public BookArray getBooksOfPublish(BookArray bookArray,String publish) {
        BookArray sortedArrayOfBook = new BookArray();
        int countBook = 0;
        if (bookArray == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }

        for (Book book : bookArray.getBooks()) {
            if (book.getPublishing().equals(publish)) {
                countBook++;
            }
        }
        if (countBook > 0) {
            Book[] newBook = new Book[countBook];
            int i = 0;
            for (Book book : bookArray.getBooks()) {
                if (book.getPublishing().equals(publish)) {
                    newBook[i] = book;
                    i++;
                }
            }
            sortedArrayOfBook.setBooks(newBook);
        }
        return sortedArrayOfBook;

    }



    public BookArray getPublishYear(BookArray bookArray,int year) {
        int countBook = 0;
        BookArray sortedArrayOfBook = new BookArray();
        if (bookArray == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }

        for (Book book : bookArray.getBooks()) {
            if (book.getPublish_year() > year) {
                countBook++;
            }
        }
        if (countBook > 0) {
            Book[] newBook = new Book[countBook];
            int i = 0;
            for (Book book : bookArray.getBooks()) {
                if (book.getPublish_year() > year) {
                    newBook[i] = book;
                    i++;
                }
            }
            sortedArrayOfBook.setBooks(newBook);
        }
        return sortedArrayOfBook;

    }


}
