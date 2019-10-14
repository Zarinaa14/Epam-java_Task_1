package com.company;

import java.util.Scanner;

// Создйте класс Test2 двумя переменными.
// Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.
public class Main {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения переменных: ");

        test2.setVar1(scanner.nextInt());
        test2.setVar2(scanner.nextInt());

        System.out.println("\nВы ввели:");
        System.out.println("Var1 = " + test2.getVar1() + ", var2 = " + test2.getVar2());
    }
}
