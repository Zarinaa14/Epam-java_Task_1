package com.epam.training.zaryna;

import java.util.*;

/*
    Класс для представления платежа(коллекция продуктов)
    Возможности:
    1) добавление/удаление продукта
    2) сортировка продуктов по различным параметрам
    3) получение общей цены/веса
    4) печать чека на консоль
 */

public class Payment {

    private ArrayList<Product> products = new ArrayList<Product>();

    public Payment() {

    }

    public Payment(int size) {
        for (int i = 0; i < size; i++) {
            products.add(new Product());
        }
    }

    public void addProduct(String name, double weight, double price) {
        products.add(new Product(name, weight, price));
    }

    public void setProduct(int index, String name, double weight, double price) {
        if (index >= 0 && price < products.size() && name != null) {
            products.set(index, new Product(name, weight, price));
        }
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void deleteProduct(String name, double weight, double price) {
        products.remove(new Product(name, weight, price));
    }

    public void sortByPrice() {
        Collections.sort(products, new ProductPriceComparator());
    }

    protected void sortByWeight() {
        Collections.sort(products, new ProductWeightComparator());
    }

    public void sortByName() {
        Collections.sort(products, new ProductNameComparator());
    }

    public double getTotalPrice() {
        double price = 0;

        for (Product product : products) {
            price += product.getPrice();
        }

        return (double) Math.round(price * 100d) / 100d;
    }

    public double getTotalWeight() {
        double weight = 0;

        for (Product product : products) {
            weight += product.getWeight();
        }

        return (double) Math.round(weight * 100d) / 100d;
    }

    public void printCashVoucher() {
        System.out.println("Общая сумма = " + getTotalPrice());
        System.out.println("Общий вес = " + getTotalWeight());
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stringValue = new StringBuilder();

        for (int i = 0; i < products.size(); i++) {
            stringValue.append(i + 1);
            stringValue.append(products.get(i).toString());
        }

        return stringValue.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Payment payment = (Payment) obj;

        boolean isEqual = true;

        for (int i = 0; i < products.size(); i++) {
            if (!products.get(i).equals(payment.products.get(i))) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
    }


    @Override
    public int hashCode() {
        int num = 31;
        int result = 1;

        for (Product product : products) {
            result = num * result + product.hashCode();
        }

        return result;
    }
}