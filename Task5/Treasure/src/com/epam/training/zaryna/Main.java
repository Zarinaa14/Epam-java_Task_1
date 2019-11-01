package com.epam.training.zaryna;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayTreasures treasures = new ArrayTreasures();
        treasures.generateTreasures(100);
        treasures.print();
        ArrayList<Treasure> treasuresWithMaxPrice=treasures.getTheMostExpensiveTreasures();
        System.out.println("Самые дорогие украшения: ");
        treasures.printArrayList(treasuresWithMaxPrice);

        ArrayList<Treasure> equalsTreasures=treasures.getTheMostExpensiveTreasures();
        System.out.println("введите цену сокровища : ");
        Scanner scanner=new Scanner(System.in);

        int treasuresPrice=scanner.nextInt();
       // if(treasuresPrice==treasures.getPrice()){
            equalsTreasures=treasures.getEqualsPriceTreasures(treasuresPrice);
            treasures.printArrayList(equalsTreasures);

       // }


    }
}
