package com.epam.training.zaryna;

//Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class Main {
    private static String arr(String string) {
        String max = "";
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > max.length()) {
                max = stringArray[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String line = "Make a word from a words";
        String maxWord = arr(line);
        System.out.println("Самое длинное слово: " + maxWord);

    }
}
