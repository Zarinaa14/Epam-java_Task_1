package com.epam.training.zaryna;

// С помощью функции копирования и операции конкатенации составить из частей слова
// “информатика” слово “торт”.

public class Main {

    public static void main(String[] args) {
        String word1 = "информатика";
        String tort = "";
        String[] arr = word1.split("");
        char symbolsOfWord1[] = word1.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
         tort=arr[7]+arr[3]+arr[4]+arr[7];}
        System.out.println(tort);
    }
}
