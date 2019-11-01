package com.epam.training.zaryna;

import java.util.*;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    private int price = 0;

    public int getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPriceForOne();
        return this;
    }
   // public void removeAllLily(int index){
      //  for(Flower flower:flowers){
               // flowers.remove(index);
        //}
   // }
    public void print(){
        System.out.println(this);
    }
    public void sortByPrice(){
        Comparator<Flower> comparator=Comparator.comparing(Flower::getPriceForOne);
        flowers.sort(comparator);
    }
    public void sortByName(){
        Comparator<Flower> comparator=Comparator.comparing(Flower::getName);
        flowers.sort(comparator);
    }
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < flowers.size(); i++) {
            string.append(i + 1);
            string.append(" ");
            string.append(flowers.get(i));
            string.append("\n");
        }

        return string.toString();
    }

}






