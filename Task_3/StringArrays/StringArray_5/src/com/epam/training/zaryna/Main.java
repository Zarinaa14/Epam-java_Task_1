package com.epam.training.zaryna;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Main {

    public static String removeExtraSpaces(String string) {
        String newString = new String();
        boolean isSpace = true;

        int lastIndex = string.length() - 1;
        while (string.charAt(lastIndex) == ' ') {
            lastIndex--;
        }

        for (int i = 0; i <= lastIndex; i++) {
            if (string.charAt(i) == ' ') {
                if (!isSpace) {
                    newString += string.charAt(i);
                }
                isSpace = true;
            } else {
                newString += string.charAt(i);
                isSpace = false;
            }
        }

        return newString;
    }

    public static void main(String[] args) {
        String line = "Word make  a word from      a word.";
        String resultString = removeExtraSpaces(line);

        System.out.println("\nПосле удаления лишних пробелов:");
        System.out.println(resultString);
    }
}
