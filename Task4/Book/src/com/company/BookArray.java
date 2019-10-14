package com.company;

import java.util.Random;

public class BookArray {
    protected Book[] arrayOfBook;
    Random random = new Random();

    protected BookArray(int size) {
        if (size > 0) {
            arrayOfBook = new Book[size];
            for (int i = 0; i < size; i++) {
                arrayOfBook[i] = new Book();
            }
        }
    }

    public void setArrayOfBooks(Book[] array) {
        if (array != null) {
            arrayOfBook = new Book[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayOfBook[i] = array[i];
            }
        }
    }

    public Book[] getArrayOfBooks() {
        return arrayOfBook;
    }

    protected int getSize() {
        if (arrayOfBook != null) {
            return arrayOfBook.length;
        } else {
            return 0;
        }
    }

    protected void runBook(String[] name, String[] autor, String[] publish, String[] typePereplet, int[] numberPage, int[] price, int[] publish_year) {
        for (int i = 0; i < 10; i++) {
            arrayOfBook[i] = new Book(name[random.nextInt(7)], autor[random.nextInt(7)], publish[random.nextInt(7)], typePereplet[random.nextInt(7)], numberPage[random.nextInt(7)], price[random.nextInt(7)], publish_year[random.nextInt(7)]);

        }
    }


    public void getBooksOfAuthor(String author) {
        if (arrayOfBook == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }
        for (Book book : arrayOfBook) {
            if (book.getAuthor().equals(author)) {
                book.print();
            }
        }
    }

    public void getBooksOfPublish(String publish) {
        if (arrayOfBook == null) {
            throw new IllegalArgumentException("Книги отсутствуют! (null)");
        }
        for (Book book : arrayOfBook) {
            if (book.getPublishing().equals(publish)) {
                book.print();
            }
        }
    }


    protected void getPublish_year(int year) {
        if (arrayOfBook == null) {
            throw new IllegalArgumentException("Книг нет");
        }
        for (Book book : arrayOfBook) {
            if (book.getPublish_year() > year) {
                book.print();
            }
        }
    }

    protected Book[] getArrayOfBook() {
        return arrayOfBook;
    }

    protected Book getBook(int index) {
        if (index >= 0 && index < getSize()) {
            return arrayOfBook[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }

    protected void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        if (arrayOfBook != null) {
            String res = new String();
            for (Book customer : arrayOfBook) {
                res += customer.toString() + "\n";
            }

            return res;

        } else {
            return "Книг нет!";
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        BookArray other = (BookArray) obj;

        boolean isEqual = other.getSize() == getSize();

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayOfBook[i].equals(other.getArrayOfBooks()[i])) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        int number = 10;
        int result = 1;

        for (int i = 0; i < getSize(); i++) {
            result = number * result + arrayOfBook[i].hashCode();
        }

        return result;
    }

}

