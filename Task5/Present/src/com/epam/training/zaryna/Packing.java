package com.epam.training.zaryna;

public class Packing {

    private String color;
    private int price;

    public Packing(String color, int price) {
        setColor(color);
        setPrice(price);
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        }
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }


    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Цвет упаковки: " + color + ", цена упаковки: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Packing packing = (Packing) obj;

        return price == packing.price && color.equals(packing.color);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = (int) (prime * result + price);
        return result;
    }
}