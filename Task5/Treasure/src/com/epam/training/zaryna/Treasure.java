package com.epam.training.zaryna;

/*
    Класс для представления сокровища.
    Возможности:
    1) изменение имени, веса, цены сокровища
    2) получение имени, веса, цены сокровища
    3) выбор сокровища
    4) вывод на консоль
 */

public class Treasure {

    private String name = "";
    private int price;
    private int weight;
    private boolean isSelected;

    public Treasure() {

    }

    public Treasure(String name, int weight, int price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void selected() {
        isSelected = true;
    }

    public void unselected() {
        isSelected = false;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Наименование: " + name
                + ", вес " + weight
                + ", цена " + price + ";" + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Treasure other = (Treasure) obj;

        return price == other.price && weight == other.weight;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + Double.hashCode(price);
        result = prime * result + Double.hashCode(weight);

        return result;
    }
}

