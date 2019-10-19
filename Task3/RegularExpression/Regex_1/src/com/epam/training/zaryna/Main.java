package com.epam.training.zaryna;

import java.util.Scanner;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class Main {



    public static void main(String[] args) {
        Action action =new Action();
        String line = "Lorem Ipsum cis limpyl adulmmyl text bof the printing.Ytyy is.RErrrr.    RErrrr.    RErrrr.RErrrr.";
        Scanner in = new Scanner(System.in);
        Info.printStartInfo();
        int k = in.nextInt();
            if (k != 1 && k != 2 && k != 3) {
                System.out.println("Пожалуйста, введите 1,2 или 3.");

            }
            if (k == 1) {
                String[] paragraphs = action.sortTheParagraphs(line);
                action.printSortParagraphs(paragraphs);

            }
            if (k == 2) {
                String[] arrayOfSentences = action.arrayOfSentences(line);
                action.task2(arrayOfSentences);

            }
            if (k == 3) {
                String[] arrayOfSentences3 = action.arrayOfSentences(line);
                action.task3(arrayOfSentences3);

            }
        }

}
