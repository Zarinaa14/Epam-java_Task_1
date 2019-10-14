package com.company;
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

public class Book {
    private int id;
    private String name;
    private String author;
    private String publish;
    private int publish_year;
    private int numberPage;
    private int price;
    private String typeOfBinding;
    int counterOfId = 0;

    public Book() {
        name = "";
        author = "";
        publish = "";
        typeOfBinding = "";
        publish_year = 0;
        numberPage = 0;
        id = +counterOfId;
        counterOfId++;
    }

    public Book(String name, String author, String publish, String typeOfBinding, int numberPage, int price, int publish_year) {
        setId(id);
        setName(name);
        setAuthor(author);
        setPublish(publish);
        setTypeOfBinding(typeOfBinding);
        setNumberPage(numberPage);
        setPrice(price);
        setPublish_year(publish_year);
    }

    protected void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    protected void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    protected void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    protected void setPublish(String publish) {
        if (publish != null && !publish.isEmpty()) {
            this.publish = publish;
        }
    }

    protected void setTypeOfBinding(String typeOfBinding) {
        if (typeOfBinding != null && !typeOfBinding.isEmpty()) {
            this.typeOfBinding = typeOfBinding;
        }
    }


    protected void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

    protected void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }


    protected void setPrice(int price) {
        this.price = price;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    protected String getAuthor() {
        return author;
    }

    protected String getPublishing() {
        return publish;
    }

    protected int getPublish_year() {
        return publish_year;
    }

    protected String getTypeOfBinding() {
        return typeOfBinding;
    }

    protected int getPrice() {
        return price;
    }

    protected void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "The name of the book: " + name
                + ", author " + author
                + ", publish " + publish
                + ", typeOfBinding " + typeOfBinding + ", publish_year " + publish_year + ", price " + price + " $" + ", numberPage " + numberPage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book other = (Book) obj;
        return name.equals(other.name) && author.equals(other.author) &&
                publish_year == other.publish_year && numberPage == other.numberPage
                && price == other.price && name.equals(other.name) && typeOfBinding.equals(other.typeOfBinding);
    }

    @Override
    public int hashCode() {
        int num = 2;
        int result = 10;
        result = num * result + ((name == null) ? 0 : name.hashCode());
        result = num * result + ((author == null) ? 0 : author.hashCode());
        result = num * result + publish_year;
        result = num * result + numberPage;
        result = num * result + Double.hashCode(price);
        result = num * result + typeOfBinding.hashCode();

        return result;
    }
}




