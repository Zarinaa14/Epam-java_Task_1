package com.company;

import java.util.Scanner;
// Заменяет в строке все вхождения 'word' на 'letter'

public class Main {

    protected static String[] changeWord(String line, String wordOld, String wordNew) {
        String[] stringArray = line.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            if(wordOld.equals(stringArray[i].toLowerCase())){
                stringArray[i]=wordNew;
            }
        }
        return stringArray;
    }
    protected static String[] printStringArray( String[] stringArray){
        for (int i = 0; i < stringArray.length; i++) {
         System.out.print(stringArray[i]+" ");
        }
        return stringArray;
    }
    protected static String string(String[] stringArray){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < stringArray.length; i++) {
            builder.append(stringArray[i]);
            builder.append(" ");
        }
        String str = builder.toString();
        return str;
    }
    protected static int digits(String string){
        int count = 0;
       for (int i = 0; i < string.length(); i++) {
           if (Character.isDigit(string.charAt(i))) {
               count++;
           }
       }
       return count;
    }
    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
       // System.out.println("Введите строку: ");
       // String line = in.nextLine();
        String line="Word make 5 a word from 6 a word.";
        String wordOld = "word";
        String wordNew = "letter";
        String[] stringArray=changeWord(line,wordOld,wordNew);
        String newLine =string(stringArray);
        String output = newLine.substring(0, 1).toUpperCase() + newLine.substring(1);
        System.out.println("\nСтрока после замены: "+output);
        int result =digits(output);
        System.out.print("Количество цифр: "+result);

    }
}