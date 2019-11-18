package com.epam.training.zaryna.parsexml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseXML {
    //Получить закрывающий тег по "названию" тега
    public String getClosingTag(String tag) {
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
    public int numOfOpeningTags(String string) {
        int num = 0;
        Pattern openingTagPat = Pattern.compile("<[^/!].+?>");
        Matcher openingTagMatcher = openingTagPat.matcher(string);
        Pattern closing = Pattern.compile("<[A-Za-z]*[/]>");
        Matcher closingTag = closing.matcher(string);

        while (openingTagMatcher.find()) {
            num++;

        }
        while (closingTag.find()) {
            num--;
        }

        return num;
    }

    //Число закрывающих тегов в строке
    public int numOfCloseTags(String string) {
        int num = 0;
        Pattern closingTagPat = Pattern.compile("</.+?>");
        Matcher closingTagMatcher = closingTagPat.matcher(string);

        while (closingTagMatcher.find()) {
            num++;
        }

        return num;
    }


    //Проверяет равно ли число откр тегов числу закр тегов
    public boolean isRightNumberOfTags(String string) {
        return numOfOpeningTags(string) == numOfCloseTags(string);
    }

    public void analyzer(String string) {
        int countOpening;
        int countClosing;
        Pattern openingTagPat = Pattern.compile("<[^/!].+?[/]?>");
        Matcher openingTagMatcher = openingTagPat.matcher(string);
        String bodyTag = null;
        String openTag;
        String closeTag;

        //Проверка на равенство числа открывающихся и закрывающихся тегов во всем документе
        if (numOfOpeningTags(string) == numOfCloseTags(string)) {
            while (openingTagMatcher.find()) {
                //когда найден открывающий тег и закрывающий тег
                openTag = openingTagMatcher.group();

                System.out.println("group " + openTag);

                closeTag = getClosingTag(openTag);
                countOpening = string.indexOf(openTag);


                countClosing = string.indexOf(closeTag);


                //если закрывающий тег не найден в строке
                if (countClosing != -1) {
                    countClosing += closeTag.length();

                    //Получение индекса первого элмента содержимого тега
                    countOpening += openTag.length();
                    while (string.charAt(countOpening) == ' ' || string.charAt(countOpening) == '\r' || string.charAt(countOpening) == '\n') {
                        countOpening++;
                    }


                    countClosing -= closeTag.length() + 1;
                    while (string.charAt(countClosing) == ' ' || string.charAt(countClosing) == '\r' || string.charAt(countClosing) == '\n') {
                        countClosing--;
                    }
                    try {
                        bodyTag = string.substring(countOpening, countClosing + 1);
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println(" ");
                    }
                    //Проверка на равенство открывающихся и закрывающихся тегов
                    if (isRightNumberOfTags(bodyTag)) {
                        System.out.println("\nОткрывающий тег: " + openTag);

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
}
