package com.epam.training.zaryna;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main {

    private static int changeAB(String string) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                count++;
            } else {
                builder.append(string.charAt(i));
            }

        }
        return count;
    }

    public static void main(String[] args) {

        String line = "Word make  a word from a word.";
        int result = changeAB(line);
        System.out.print(" Буква “а” встречается " + result);
    }
}

