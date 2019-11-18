package com.epam.training.zaryna;
import com.epam.training.zaryna.parsexml.ParseXML;

public class Main {
    public static void main(String[] args) {
        String line2 = "<notes><to>Вася</to><from>Света</from><heading>Напоминание</heading></notes>";
        String line = "<notes><note id = '1'><to>Вася</to><from>Света</from>" +
                "<heading>Напоминание</heading><body>Позвони мне завтра!</body>" +
                "</note><note id ='2'><to>Петя</to><from>Маша</from><heading>Важное напоминание</heading>" +
                "<body/></note></notes>";
        ParseXML parseXML = new ParseXML();
        parseXML.analyzer(line);

    }
}