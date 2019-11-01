package com.epam.training.zaryna;

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
        ActionTrain actionTrain = new ActionTrain();
        ArrayOfTrains arrayOfTrains = new ArrayOfTrains();
        arrayOfTrains = actionTrain.getRandomTrains(6);
        int choice = 0;
        arrayOfTrains.print();
        Info info = new Info();
        while (choice != 5) {
            info.printStartInfo();
            Scanner in = new Scanner(System.in);

            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Сортировка элементов массива по номерам поездов: ");
                    ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
                    newArrayOfTrains = actionTrain.sortByNumberOfTrain(arrayOfTrains);
                    newArrayOfTrains.print();
                    info.printLine();
                    break;
                }
                case 2: {
                    System.out.println("ВВедите номер поезда: ");
                    int number = in.nextInt();
                    System.out.println("Информация по номеру поездов: ");

                    ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
                    newArrayOfTrains = actionTrain.printInfoByNumber(arrayOfTrains, number);
                    if (newArrayOfTrains != null) {
                        newArrayOfTrains.print();
                    } else {
                        System.out.println("Информации нет!");
                    }
                    info.printLine();
                    break;
                }
                case 3: {
                    System.out.println("Сортировка по пунктам назначения(по алфавиту), если пункты равны, по времени отправления: ");
                    actionTrain.sortByDestination(arrayOfTrains);
                    arrayOfTrains.print();
                    break;
                }
                case 4: {
                    System.out.println("Сортировка массива по номерам поезда");
                    ArrayOfTrains newArrayOfTrains = new ArrayOfTrains();
                    actionTrain.sortByNumberOfTrain(arrayOfTrains);
                    arrayOfTrains.print();
                    break;
                }

            }


        }
    }
}
