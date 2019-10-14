package com.company;

import java.util.Scanner;

//. Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.

public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения переменных: ");

        test1.setVariable1(scanner.nextInt());
        test1.setVariable2(scanner.nextInt());

        System.out.println("\nВы ввели:");
        test1.printVariables();
        System.out.println("\nMax = " + test1.returnMax());

        System.out.println("\nSum = " + test1.sumVars());


    }
}
