package com.epam.training.zaryna;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Action {
    //сортирует абзацы по количеству предложений
    public String[] sortTheParagraphs(String string) {
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
    public int getNumOfSentences(String string) {
        String pattern = "([.!?])([A-Z]*)";
        Pattern r = Pattern.compile(pattern);  // Create a Pattern object
        Matcher m = r.matcher(string);   // Now create matcher object.
        int count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }

    public void printSortParagraphs(String[] paragraphs) {
        System.out.println("абзацы  отсортированы по количеству предложений: ");
        for (int i = 0; i < paragraphs.length; i++) {
            int count = i + 1;
            System.out.println(count + " paragraph " + getNumOfSentences(paragraphs[i]) + " sentence. " + paragraphs[i] + " ");
        }
    }


    //задание 2
    //возвращает StringBuilder из массива предложений и вызывает функцию sortLine
    public void task2(String[] stringArray) {
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
    public String[] arrayOfSentences(String string) {
        String[] stringArrayOfSentences = string.split("[.!?]");
        return stringArrayOfSentences;
    }

    //разбивает на слова и вызывает  arraySort() слов
    public String sortLine(String line) {
        String[] words = (line + " ").split("\\p{P}?[ \\t\\n\\r]+");
        arraySort(words);
        String str = printSortWordsInSentences(words);
        return str;
    }

    //сортирует массив из слов по длине от меньшего к большему
    public String[] arraySort(String[] arrayWords) {
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

    public String printSortWordsInSentences(String[] array) {
        String str = "";
        for (String word : array) {
            str += word + " ";
        }
        return str;
    }

    //3
    // возвращает StringBuilder из массива предложений и вызывает функцию sortLine
    public String task3(String[] stringArray) {
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

    public String[] splitIntoWords(String line) {
        String[] words = (line + " ").split("\\p{P}?[ \\t\\n\\r]+");
        return words;
    }

    // разбивает на слова и вызывает  arraySortBySymbol() из слов splitIntoWords
    public String checkArraySort(String[] words) {
        int count = 0;
        int co = 2;
        char symbol = 'l';
        for (int i = 0; i < words.length; i++) {
            count = calculateCharInWord(words[i]);
            sortBySymbol(words, symbol);

        }

        String str = printSortWordsInSentences(words);
        return str;
    }

    public void arraySortAlphabet(String[] words) {
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


    public String[] sortBySymbol(String[] arrayWords, char symbol) {
        int count = 0;
        int co = 2;
        for (int i = 0; i < arrayWords.length - 1; i++) {
            for (int j = 0; j < arrayWords.length - 1 - i; j++) {
                int curr = calculateCharInWord2(arrayWords[j], symbol);
                int curr_1 = calculateCharInWord2(arrayWords[j + 1], symbol);
                count = calculateCharInWord(arrayWords[j]);
                if (co == count) {
                    String[] arr = {arrayWords[j], arrayWords[j + 1]};
                    arraySortAlphabet(arr);
                    for (int k = 0; k < arr.length; k++) {
                        arrayWords[j] = arr[0];
                        arrayWords[j + 1] = arr[1];
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
    public boolean isExistCharInWord(String string) {
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == 'l')) {
                //System.out.print(i);
                return true;
            }
        }
        return false;
    }


    //  считает сколько заданных символов в слове, если нет то 0
    public int calculateCharInWord(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == 'l')) {
                //System.out.print(i);
                count++;

            }
        }
        return count;
    }

    public int calculateCharInWord2(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == symbol)) {
                //System.out.print(i);
                count++;

            }
        }
        return count;
    }
}
