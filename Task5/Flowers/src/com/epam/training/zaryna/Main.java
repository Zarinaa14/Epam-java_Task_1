package com.epam.training.zaryna;
/**
 *  Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию).
 *  Составляющими цветочной композиции являются цветы и упаковка.
 */
public class Main {

    public static void main(String[] args) {
        int totalPrice = 0;
        Rouse rouse1 = new Rouse(Color.White,"small");
        Rouse rouse2 = new Rouse(Color.Green,"small");
        Rouse rouse3 = new Rouse(Color.Yellow,"small");
        Violet violet1 = new Violet(Color.Red);
        Bouquet bouquet = new Bouquet();
        Tulip tulip1=new Tulip(Color.Red);
        bouquet.addFlower(rouse1).addFlower(rouse2).addFlower(violet1).addFlower(rouse3).addFlower(tulip1);
        //bouquet.removeAllLily(3);
        bouquet.sortByPrice();
        bouquet.print();
        Packing packing = new Packing("Red", 15);
        totalPrice = bouquet.getPrice() + packing.getPrice();
        System.out.println("The cost of the bouquet is equal to "+totalPrice+"$");
    }
}
