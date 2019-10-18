package com.epam.training.zaryna;

/**
 * 6(Циклы). Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Main {
    public static void main(String[] args) {

        char chars = '\u0000';
        int charsNumber = 0;
        for (int i = 0; i <= 10000; i++) {
            chars++;
            charsNumber++;
            System.out.println("Символ: " + chars + "  номер : " + charsNumber);
        }
    }

}
