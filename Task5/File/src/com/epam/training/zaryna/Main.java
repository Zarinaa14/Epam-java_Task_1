package com.epam.training.zaryna;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 *  Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        TextFile file = new TextFile("test.txt", new Directory("C:\\"));
        System.out.println("File name: " + file.getName());
        file.rename("test2.txt");

        file.addContent("This is test content.");

        System.out.println("File content: " + file.getContent());
        System.out.println("File name: " + file.getName());
        file.delete();
    }
}
