package com.epam.training.zaryna;

public class Rouse extends Flower {
    private String size;

    public Rouse(Color color,String size) {
        super("Rouse", 5,color);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;

    }
}
