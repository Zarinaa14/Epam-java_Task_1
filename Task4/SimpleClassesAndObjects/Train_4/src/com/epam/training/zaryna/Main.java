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
        ArrayOfTrains arrayOfTrain = new ArrayOfTrains(5);
        String[] arrayNameOfDestination = new String[]{"Minsk", "Gdansk", "Belarus", "Vilnius", "Pinsk", "Vienna", "Bransk", "Montenegro", "Astana"};
        int[] arrayDepartureTime = new int[]{23, 11, 24, 14, 12, 5, 8, 6, 2, 3};
        int[] arrayNumberOfTrain = new int[]{88, 10, 99, 98, 10, 77, 12, 56, 12, 45};
        arrayOfTrain.getRandomTrains(arrayNameOfDestination, arrayNumberOfTrain, arrayDepartureTime);
        arrayOfTrain.print();
        Info info = new Info();
        info.printStartInfo();
        Scanner in = new Scanner(System.in);
        int choice;
        choice = in.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Сортировка элементов массива по номерам поездов: ");
                arrayOfTrain.sortByNumberOfTrain();
                arrayOfTrain.print();
                info.printLine();
                break;
            }
            case 2: {
                System.out.println("ВВедите номер поезда: ");
                int number = in.nextInt();
                System.out.println("Информация по номеру поездов: ");
                info.printLine();
                arrayOfTrain.printInfoByNumber(number);
                break;
            }
            case 3: {
                System.out.println("Сортировка по пунктам назначения(по алфавиту), если пункты равны, по времени отправления: ");
                arrayOfTrain.sortByDestination();
                arrayOfTrain.print();
                break;
            }
            case 4: {
                System.out.println("Сортировка массива по номерам поезда");
                arrayOfTrain.sortByNumberOfTrain();
                arrayOfTrain.print();
                break;
            }
        }


    }
}
