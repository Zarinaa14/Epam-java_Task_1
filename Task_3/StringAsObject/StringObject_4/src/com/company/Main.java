package com.company;

// С помощью функции копирования и операции конкатенации составить из частей слова
// “информатика” слово “торт”.

public class Main {

    public static void main(String[] args) {
        String word1 = "информатика";
        StringBuilder builder = new StringBuilder();
        // StringBuilder  strCopy = new StringBuilder (word1);
        char symbolsOfWord1[] = word1.toCharArray();
        char symbolT = word1.charAt(7);
        char symbolO = word1.charAt(3);
        char symbolR = word1.charAt(4);
        String word2 = builder.append(symbolT).append(symbolO).append(symbolR).append(symbolT).toString();
        System.out.println(word2);
    }
}
