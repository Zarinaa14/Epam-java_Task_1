package com.epam.training.zaryna;
//Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.
public class Main {

    public static void main(String[] args) {
        Word word = new Word("Example");
        Text text = new Text(word);

        Word word1 = new Word("This");
        Word word2 = new Word("is");
        Word word3 = new Word("example");

        Sentence phrase = new Sentence();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Text:"+text.getBody());

    }
}
