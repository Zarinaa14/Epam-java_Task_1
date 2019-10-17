package com.company.com.epam.trainig;

import java.util.Scanner;

// Создайте класс Train, содержащий поля:
// название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
// должны быть упорядочены по времени отправления.
public class Main {

    public static void main(String[] args) {
        Train[] arrayOfTrain = new Train[5];
        arrayOfTrain[0] = new Train("Minsk", 34, 12);
        arrayOfTrain[1] = new Train("Mockow", 55, 10);
        arrayOfTrain[2] = new Train("Poland", 12, 7);
        arrayOfTrain[3] = new Train("Mockow", 4, 5);
        arrayOfTrain[4] = new Train("Vienna", 56, 4);
        Info info =new Info();
        System.out.println("Сортировка элементов массива по номерам поездов: ");
        info.printLine();
        Train.sortByNumberOfTrain(arrayOfTrain);
        //Train.print();
        for (int i = 0; i < arrayOfTrain.length; i++) {
            System.out.println(arrayOfTrain[i].toString());
        }
        Scanner in = new Scanner(System.in);
        info.printLine();
        System.out.println("ВВедите номер поезда: ");
        int number = in.nextInt();
        if (number == 34 || number == 55 || number == 12 || number == 4 || number == 56) {
            System.out.println("Информация элемента массива по номеру поездов: ");
            info.printLine();
            Train.printInfoByNumber(number, arrayOfTrain);
        } else {
            System.out.println("Введите правильный номер поезда: ");
        }
        info.printLine();
        System.out.println("Сортировка массива по пункту назначения(по алфавиту), если пункты равны, по времени отправления: ");
        info.printLine();
        Train.sortByDestination(arrayOfTrain);
        for (int i = 0; i < arrayOfTrain.length; i++) {
            System.out.println(arrayOfTrain[i].toString());
        }
    }
}
