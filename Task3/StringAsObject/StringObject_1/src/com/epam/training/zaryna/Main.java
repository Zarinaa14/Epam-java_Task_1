package com.epam.training.zaryna;
/*
    Находит наибольшее число подряд идущих пробелов в строке
 */

public class Main {

    public static int maxNumberOfSpaces(String string) {
        int numOfSpaces = 0;
        int currNum = 0;
        int index = 0;

        while (true) {
            index = string.indexOf(' ', index);

            if (index != -1) {
                while (index < string.length() && string.charAt(index) == ' ') {
                    currNum++;
                    index++;
                }

                if (currNum > numOfSpaces) {
                    numOfSpaces = currNum;
                }

                currNum = 0;
            } else {
                break;
            }
        }

        return numOfSpaces;
    }

    public static void main(String[] args) {
        String line = "abc  cde def";

        int numOfSpaces = maxNumberOfSpaces(line);
        System.out.println("Наибольшее число пробелов подряд: " + numOfSpaces);
    }
}
