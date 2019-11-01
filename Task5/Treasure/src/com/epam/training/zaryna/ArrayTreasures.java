package com.epam.training.zaryna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * генерация 100 сокровищ в пещере
 * просмотра сокровищ
 * выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 * сортировка сокровиш
 */
public class ArrayTreasures {
    private static final String[] name = new String[]{"серьги", "золотые тарелки", "бриллиантовые Камни", "золотая сковородка", "золотой кувшин", "изумрудная шкатулка", "серебрянные часы", "золотое Колье", "браслет с бриллиантами", "кольцо с алмазом", "статуя с самоцветами", "мешок с золотом"};
    private static final int[] weight = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    private static final int[] price = new int[]{244, 455, 532, 656, 889, 81, 533, 44, 557, 922, 189};
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    public ArrayTreasures() {

    }

    public void generateTreasures(int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            treasures.add(new Treasure(name[random.nextInt(12)], weight[random.nextInt(10)], price[random.nextInt(10)]));
        }
    }

    public int getSize() {
        return treasures.size();
    }
    public int getPrice() {
        return getPrice();
    }
    public double getTotalPrice() {
        double total = 0;

        for (Treasure treasure : treasures) {
            total += treasure.getPrice();
        }

        return (double) Math.round(total * 100d) / 100d;
    }

    public double getTotalWeight() {
        double total = 0;

        for (Treasure treasure : treasures) {
            total += treasure.getWeight();
        }

        return (double) Math.round(total * 100d) / 100d;
    }

    public ArrayList<Treasure> getTheMostExpensiveTreasures() {
        ArrayList<Treasure> maxPrices = new ArrayList<Treasure>();
        if (!treasures.isEmpty()) {
            Treasure theMostExp = treasures.get(0);
            for (Treasure treasure : treasures) {
                if (treasure.getPrice() > theMostExp.getPrice()) {
                    theMostExp = treasure;
                }
            }
            for (Treasure treasure : treasures) {
                if (theMostExp.getPrice() == (treasure.getPrice())) {
                    maxPrices.add(treasure);
                }
            }
            return maxPrices;

        } else {
            return maxPrices;
        }
    }
    public ArrayList<Treasure> getEqualsPriceTreasures(int price) {
        ArrayList<Treasure> prices = new ArrayList<Treasure>();
        if (!treasures.isEmpty()) {
            for (Treasure treasure : treasures) {
                if (treasure.getPrice() == price) {
                    prices.add(treasure);
                }
            }
            return prices;

        } else {
            return prices;
        }
    }

    public void printArrayList(ArrayList<Treasure> list) {
        StringBuilder listString = new StringBuilder();

        for (Object object : list) {
            listString.append(object);
        }

        System.out.println(listString);
    }


    //Сортирует сокровища по цене, если цена одинаковая, то по весу, если вес одинаков, то по названию
    public void sortTreasures() {
        Comparator<Treasure> comparator = Comparator.comparing(Treasure::getPrice);
        comparator = comparator.thenComparing(Treasure::getWeight);
        comparator = comparator.thenComparing(Treasure::getName);
        treasures.sort(comparator);
    }


    public void print() {
        System.out.println(this);
        System.out.println("\nОбщая стоимость: " + getTotalPrice() + ", общий вес: " + getTotalWeight() + "\n");
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < treasures.size(); i++) {
            string.append(i + 1 + " ");
            string.append(treasures.get(i));
            string.append(" ");

        }

        return string.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayTreasures other = (ArrayTreasures) obj;

        boolean isEqual = (getSize() == other.getSize());

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!treasures.get(i).equals(other.treasures.get(i))) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        for (Treasure treasure : treasures) {
            result = prime * result + treasure.hashCode();
        }

        return result;
    }


}
