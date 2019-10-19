package com.epam.training.zaryna;

//В строке вставить после каждого символа 'a' символ 'b'.
public class Main {

    private static String changeAB(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                builder.append("ab");
            } else {
                builder.append(string.charAt(i));
            }

        }
        return builder.toString();
    }

    public static void main(String[] args) {

        String line = "Word make  a word from a word.";
        String result = changeAB(line);
        System.out.print("Строка после замены ab " + result);
    }
}
