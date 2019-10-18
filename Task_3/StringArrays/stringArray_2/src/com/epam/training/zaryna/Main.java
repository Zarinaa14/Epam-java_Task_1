package com.epam.training.zaryna;
/**
 * Заменяет в строке все вхождения 'word' на 'letter'
 */
public class Main {

    public static void main(String[] args) {
        StringAction action =new StringAction();
      //  Scanner in = new Scanner(System.in);
       // System.out.println("Введите строку: ");
       // String line = in.nextLine();
        String line="Word make 5 a word from 6 a word.";
        String wordOld = "word";
        String wordNew = "letter";
        String[] stringArray=action.changeWord(line,wordOld,wordNew);
        String newLine =action.string(stringArray);
        String output = newLine.substring(0, 1).toUpperCase() + newLine.substring(1);
        System.out.println("\nСтрока после замены: "+output);
        int result =action.digits(output);
        System.out.print("Количество цифр: "+result);

    }
}