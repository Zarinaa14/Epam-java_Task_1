package com.company;

import java.util.regex.*;
import java.util.Scanner;

// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
// отсортировать абзацы по количеству предложений;
// в каждом предложении отсортировать слова по длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
public class Main {
    //сортирует абзацы по количеству предложений
    private static String[] operation_1(String string) {
        String[] paragraphs = string.split("   ");//абзац - три пробела
        for (int i = 0; i < paragraphs.length - 1; i++) {
            for (int j = 0; j < paragraphs.length - 1 - i; j++) {
                int curr = getNumOfSentences(paragraphs[j]);
                int curr_1 = getNumOfSentences(paragraphs[j + 1]);
                if (curr > curr_1) {
                    String tmp = paragraphs[j];
                    paragraphs[j] = paragraphs[j + 1];
                    paragraphs[j + 1] = tmp;
                }

            }
        }
        return paragraphs;
    }

    //Считает кол-во предложений в тексте
    public static int getNumOfSentences(String string) {
        String pattern = "([.!?])([A-Z]*)";
        Pattern r = Pattern.compile(pattern);  // Create a Pattern object
        Matcher m = r.matcher(string);   // Now create matcher object.
        int count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }

    private static void printSortParagraphs(String[] paragraphs) {
        System.out.println("абзацы  отсортированы по количеству предложений: ");
        for (int i = 0; i < paragraphs.length; i++) {
            int count = i + 1;
            System.out.println(count + " paragraph " + getNumOfSentences(paragraphs[i]) + " sentence. " + paragraphs[i] + " ");
        }
    }


    //задание 2
    //возвращает StringBuilder из массива предложений и вызывает функцию sortLine
    private static void task2(String[] stringArray) {
        System.out.println("Слова в предложениях отсортированы по длине: ");
        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(stringArray[i]);
            builder.append(" ");
            String str = builder.toString();
            String result = sortLine(str);
            System.out.println("" + result);
        }

    }

    //возвращает массив из предложений
    private static String[] arrayOfSentences(String string) {
        String[] stringArrayOfSentences = string.split("[.!?]");
        return stringArrayOfSentences;
    }

    //разбивает на слова и вызывает  arraySort() слов
    public static String sortLine(String line) {
        String[] words = (line + " ").split("\\p{P}?[ \\t\\n\\r]+");
        arraySort(words);
        String str = printSortWordsInSentences(words);
        return str;
    }

    //сортирует массив из слов по длине от меньшего к большему
    public static String[] arraySort(String[] arrayWords) {
        for (int i = 0; i < arrayWords.length; i++) {
            for (int j = 0; j < arrayWords.length; j++) {
                if (arrayWords[i].length() < arrayWords[j].length()) {
                    String word = arrayWords[i];
                    arrayWords[i] = arrayWords[j];
                    arrayWords[j] = word;
                }
            }
        }
        return arrayWords;
    }

    public static String printSortWordsInSentences(String[] array) {
        String str = "";
        for (String word : array) {
            str += word + " ";
        }
        return str;
    }

    //3
    // возвращает StringBuilder из массива предложений и вызывает функцию sortLine
    private static String task3(String[] stringArray) {
        String result = "";
        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(stringArray[i]);
            builder.append(" ");
            String str = builder.toString();
            String[] words = splitIntoWords(str);
            result = checkArraySort(words);
            System.out.println("" + result);

        }
        return result;
    }

    private static String[] splitIntoWords(String line) {
        String[] words = (line + " ").split("\\p{P}?[ \\t\\n\\r]+");
        return words;
    }

    // разбивает на слова и вызывает  arraySortBySymbol() из слов splitIntoWords
    private static String checkArraySort(String[] words) {
        int count = 0;
        int co=2;
        char symbol='l';
        for (int i = 0; i < words.length; i++) {
            count = calculateCharInWord(words[i]);
            sortBySymbol(words,symbol);

        }

        String str = printSortWordsInSentences(words);
        return str;
    }

    private static void arraySortAlphabet(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].toLowerCase().compareTo(words[i].toLowerCase()) > 0) {
                    String tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }

    }





    private static String[] sortBySymbol(String[] arrayWords,char symbol) {
        int count = 0;
        int co=2;
        for (int i = 0; i < arrayWords.length - 1; i++) {
            for (int j = 0; j < arrayWords.length - 1 - i; j++) {
                int curr = calculateCharInWord2(arrayWords[j],symbol);
                int curr_1 = calculateCharInWord2(arrayWords[j+1],symbol);
                count = calculateCharInWord(arrayWords[j]);
                if(co==count){
                    String[] arr = {arrayWords[j], arrayWords[j + 1]};
                    arraySortAlphabet(arr);
                    for (int k = 0; k < arr.length ; k++) {
                        arrayWords[j]=arr[0];
                        arrayWords[j+1]=arr[1];
                    }
                }


                if (curr < curr_1) {
                    String tmp = arrayWords[j];
                    arrayWords[j] = arrayWords[j + 1];
                    arrayWords[j + 1] = tmp;
                }

            }
        }
        return arrayWords;
    }

    //  проверяет есть ли символ в слове
    private static boolean isExistCharInWord(String string) {
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == 'l')) {
                //System.out.print(i);
                return true;
            }
        }
        return false;
    }


    //  считает сколько заданных символов в слове, если нет то 0
    private static int calculateCharInWord(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == 'l')) {
                //System.out.print(i);
                count++;

            }
        }
        return count;
    }
    private static int calculateCharInWord2(String string,char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == symbol)) {
                //System.out.print(i);
                count++;

            }
        }
        return count;
    }


    public static void main(String[] args) {
        String line = "Lorem Ipsum cis limpyl adulmmyl text bof the printing.Ytyy is.RErrrr.    RErrrr.    RErrrr.RErrrr.";
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите 1, если хотите отсортировать абзацы по количеству предложений");
        System.out.println("Нажмите 2, если хотите в каждом предложении отсортировать слова по длине");
        System.out.println("Нажмите 3, если хотите  отсортировать лексемы в предложении по убыванию количества вхождений заданного символа");
        int k = in.nextInt();
        if (k != 1 && k != 2 && k != 3) {
            System.out.println("Пожалуйста, введите 1,2 или 3.");
        }
        if (k == 1) {
            String[] paragraphs = operation_1(line);
            printSortParagraphs(paragraphs);
        }
        if (k == 2) {
            String[] arrayOfSentences = arrayOfSentences(line);
            task2(arrayOfSentences);
        }
        if (k == 3) {
            String[] arrayOfSentences3 = arrayOfSentences(line);
            task3(arrayOfSentences3);
        }
    }
}
