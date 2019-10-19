package com.epam.training.zaryna;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.
public class Main {
    private static int calculateSentences(String string) {
        String symbol = ".?!";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (symbol.indexOf(string.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String line = "Make a word from a words. Make a word from a words!";
        int count = calculateSentences(line);
        System.out.println("Количесво предложений: " + count);
    }
}
