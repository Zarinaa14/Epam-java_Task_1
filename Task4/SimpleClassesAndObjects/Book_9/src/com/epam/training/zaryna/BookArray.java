package com.epam.training.zaryna;

public class BookArray {

    public Book[] books = new Book[0];


    public BookArray() {
        setBooks(books);
    }

    public void setBooks(Book[] array) {
        books = array;
    }

    public Book[] getBooks() {
        return books;
    }


    public int getLengthBook() {
        return books.length;
    }


    public Book getBooksIndex(int index) {
        if (index >= 0 && index < books.length) {
            return books[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }


    public Book[] getArrayOfBooks() {
        return books;
    }


    public Book getAirplane(int index) {
        if (index >= 0 && index < getLengthBook()) {
            return books[index];
        } else {
            throw new IllegalArgumentException("Выход за пределы массива!");
        }
    }


    public Book[] addAirline(Book airline) {
        if (books == null) {
            throw new IllegalArgumentException("Массив нулевой длины");
        }
        Book[] newAirlines = new Book[getLengthBook() + 1];

        for (int i = 0; i < getLengthBook(); i++) {
            newAirlines[i] = books[i];
        }
        newAirlines[getLengthBook()] = airline;
        books = newAirlines;
        return newAirlines;

    }


    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        if (books.length > 0) {
            StringBuilder res = new StringBuilder();
            for (Book airplane : books) {
                res.append(airplane);
                res.append("\n");
            }
            return res.toString();
        } else {
            return "Покупатели отсутствуют!";
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

        boolean isEqual = other.getLengthBook() == getLengthBook();

        for (int i = 0; isEqual && i < getLengthBook(); i++) {
            if (!books[i].equals(other.getArrayOfBooks()[i])) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        int number = 10;
        int result = 1;

        for (int i = 0; i < getLengthBook(); i++) {
            result = number * result + books[i].hashCode();
        }

        return result;
    }

}

