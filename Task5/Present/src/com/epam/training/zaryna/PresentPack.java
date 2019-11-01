package com.epam.training.zaryna;

public class PresentPack {
    public void getPresentToys(String nameEdible, String nameInedible, int price1, int price2, String colorPack, int pricePack) {
        int totalPrice1 = 0;
        Packing packing = new Packing(colorPack, pricePack);
        Chocolate chocolate = new Chocolate(nameEdible, price1);
        Toy teddyBear = new Toy(nameInedible, price2);
        PresentArray present = new PresentArray();
        present.addPresent(teddyBear).addPresent(chocolate);
        present.sortByPrice();
        present.print();
        totalPrice1 = packing.getPrice() + packing.getPrice();
        System.out.println("The cost of the present is equal to " + totalPrice1 + "$");
        System.out.println("----------------------------------------------------------");
    }
    public void getPresentWithFlowers(String nameEdible, String nameInedible, int price1, int price2, String colorPack, int pricePack) {
        int totalPrice1 = 0;
        Chocolate chocolate = new Chocolate(nameEdible, price1);
        Flowers flowers = new Flowers(nameInedible, price2);
        PresentArray present = new PresentArray();
        present.addPresent(flowers).addPresent(chocolate);
        present.sortByPrice();
        present.print();
        Packing packing = new Packing(colorPack, pricePack);
        totalPrice1 = packing.getPrice() + packing.getPrice();
        System.out.println("The cost of the present 2 is equal to " + totalPrice1 + "$");
    }
}
