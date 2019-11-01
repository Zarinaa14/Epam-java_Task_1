package com.epam.training.zaryna;

import java.util.ArrayList;
import java.util.Comparator;

public class PresentArray {
    private ArrayList<Present> presents = new ArrayList<Present>();

    public PresentArray() {

    }

    private int price = 0;

    public int getPrice() {
        return price;
    }

    public PresentArray addPresent(Present present) {
        presents.add(present);
        price += present.getPriceForOne();
        return this;
    }


    public void print() {
        System.out.println(this);
    }

    public void sortByPrice() {
        Comparator<Present> comparator = Comparator.comparing(Present::getPriceForOne);
        presents.sort(comparator);
    }

    public void sortByName() {
        Comparator<Present> comparator = Comparator.comparing(Present::getName);
        presents.sort(comparator);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < presents.size(); i++) {
            string.append(i + 1);
            string.append(" ");
            string.append(presents.get(i));
            string.append("\n");
        }

        return string.toString();
    }
}
