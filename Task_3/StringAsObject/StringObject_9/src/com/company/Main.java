package com.company;
// Посчитать количество строчных (маленьких) и прописных
// (больших) букв в введенной строке. Учитывать только английские буквы
public class Main {

    public static void main(String[] args) {
        String line = "Make a word from a words";
        int upperCaseLettersCount = 0;
        int lowerCaseLettersCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                upperCaseLettersCount++;
            } else {
                lowerCaseLettersCount++;
            }
        }

        System.out.println("Upper case letters count: " + upperCaseLettersCount);
        System.out.println("Lower case letters count: " + lowerCaseLettersCount);
    }
}
