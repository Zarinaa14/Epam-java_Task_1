package com.company;

import java.util.regex.*;
import java.util.Scanner;

public class Main {

    //Получить закрывающий тег по "названию" тега
    private static String getClosingTag(String tag) {
        if (tag == null || tag.isEmpty()) {
            return "";
        }

        Pattern wordPat = Pattern.compile("\\b[a-zA-ZА-Яа-я]+?\\b");
        Matcher wordMatch = wordPat.matcher(tag);

        if (wordMatch.find()) {
            return "</" + wordMatch.group() + ">";
        } else {
            return " ";
        }
    }

    //Число открывающих тегов в строке
    public static int numOfOpeningTags(String string) {
        int num = 0;
        Pattern openingTagPat = Pattern.compile("<[^/!].+?>");
        Matcher openingTagMathcer = openingTagPat.matcher(string);

        while (openingTagMathcer.find()) {
            num++;
        }

        return num;
    }

    //Число закрывающих тегов в строке
    public static int numOfCloseTags(String string) {
        int num = 0;
        Pattern closingTagPat = Pattern.compile("</.+?>");
        Matcher closingTagMathcer = closingTagPat.matcher(string);

        while (closingTagMathcer.find()) {
            num++;
        }

        return num;
    }

    //Проверяет равно ли число откр тегов числу закр тегов
    public static boolean isRightNumberOfTags(String document) {
        return numOfOpeningTags(document) == numOfCloseTags(document);
    }
    
    public static void analyzer(String document) {
        int countOpening;
        int countClosing;
        Pattern openingTagPat = Pattern.compile("<[^/!].+?>");
        Matcher openingTagMatсher = openingTagPat.matcher(document);
        String bodyTag;
        String openTag;
        String closeTag;

        //Проверка на равенство числа открывающихся и закрывающихся тегов во всем документе
        if (numOfOpeningTags(document) == numOfCloseTags(document)) {
            while (openingTagMatсher.find()) {
                //когда найден открывающий тег и закрывающий тег
                openTag = openingTagMatсher.group();
                closeTag = getClosingTag(openTag);
                countOpening = document.indexOf(openTag);
                countClosing = document.indexOf(closeTag);
                //если закрывающий тег не найден в строке
                if (countClosing != -1) {
                    countClosing += closeTag.length();

                    //Получение индекса первого элмента содержимого тега
                    countOpening += openTag.length();
                    while (document.charAt(countOpening) == ' ' || document.charAt(countOpening) == '\r' || document.charAt(countOpening) == '\n') {
                        countOpening++;
                    }


                    countClosing -= closeTag.length() + 1;
                    while (document.charAt(countClosing) == ' ' || document.charAt(countClosing) == '\r' || document.charAt(countClosing) == '\n') {
                        countClosing--;
                    }

                    bodyTag = document.substring(countOpening, countClosing);

                    //Проверка на равенство открывающихся и закрывающихся тегов
                    if (isRightNumberOfTags(bodyTag)) {
                        System.out.println("\nОткрывающий тег: ");

                        if (bodyTag.isEmpty()) {
                            System.out.println("\nТег без тела.");//

                        } else {
                            System.out.println("\nСодержимое тега:" + bodyTag);//

                        }

                        System.out.println("\nЗакрывающий тег: " + closeTag);

                    } else {
                        System.out.println("Ошибка! Нарушена вложенность тегов!");
                    }

                } else {
                    System.out.println("Ошибка! Не найден закрывающий тег " + closeTag);
                }
            }
        } else {
            System.out.println("Ошибка! Количество открывающих тегов не равна количетсву закрывающих тегов!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "<notes><to>Вася</to><from>Света</from><heading>Напоминание</heading></notes>";
        String line2 = "<notes><note id = '1'><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note><note id ='2'><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading>  <body/> </note> </notes>";
       //в данном XML документе   <body/>  не открыт !

        int count = 0;
        System.out.println("Введите 1, чтобы запустить анализатор ");

        count = scanner.nextInt();
        if (count == 1) {
            analyzer(line);

        }
    }
}