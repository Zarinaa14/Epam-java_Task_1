package com.company;

/**  Создать класс Airline, спецификация которого приведена ниже.
 Определить конструкторы, set- и get- методы и метод  toString().
 Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

 Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного. **/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayAirlines arrayAirlines = new ArrayAirlines(10);

        String[] arrayPlaneType = {"Airbus A330", "Boeing-737", "Airbus A567", "Boeing-747", "Boeing-777", "Boeing-767", "Boeing-524", "Airbus B567", "Airbus H876"};
        int[] arrayFlightNumber = {4533, 5543, 7654, 9876, 3211, 2345, 4456, 5456, 5443, 6676};
        String[] arrayOfDestination = {"Minsk", "Moscow", "Poland", "Italy", "Spain", "Egypt", "France", "Netherlands", "Russia", "Ukraine"};
        String[] arrayOfDays = {" Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " Saturday", "Sunday"};

        arrayAirlines.getRandomAirline(arrayOfDestination, arrayFlightNumber, arrayPlaneType, arrayOfDays);
        arrayAirlines.print();

        //arrayAirlines.getFlightsToDestination("Minsk");
        //System.out.println("_____________________________________");
        //arrayAirlines.getDays("Wednesday");
        //System.out.println("_____________________________________");
        //arrayAirlines.getFlightsForDay("Thursday", "01:00:00");
        //arrayAirlines.getFlightsForDay("Monday", "01:00:00");
        //arrayAirlines.getFlightsForDay("Tuesday", "01:00:00");
        int choice = 1;
        while (choice != 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Нажмите 1, чтобы вывести список рейсов для заданного пункта назначения \n" +
                    "Нажмите 2, чтобы вывести список рейсов для заданного дня недели \n" +
                    "Нажмите 3, чтобы вывести список рейсов для заданного дня недели, время вылета для которых больше заданного \n" +
                    "Нажмите 5, чтобы выйти\n");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Задайте любой пункта назначения с большой буквы, который написан выше: \n");
                String destination = scanner.next();
                System.out.println("Данные по заданному пункту назначения: ");
                arrayAirlines.getFlightsToDestination(destination);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 2) {
                System.out.println("Задайте любой день недели с большой буквы, который написан выше: \n");
                String day = scanner.next();
                System.out.println("Данные по заданному дню недели: ");
                arrayAirlines.getDays(day);
                System.out.println("--------------------------------------\n");
                continue;
            }
            if (choice == 3) {
                System.out.println("Задайте любой день недели с большой буквы , который написан выше: \n");
                String day = scanner.next();
                System.out.println("Задайте время вылета в формате 00:00:00: \n");
                String time = scanner.next();
                System.out.println("Данные по заданному дню недели,время вылета для которых больше заданного: ");
                arrayAirlines.getFlightsForDay(day, time);
                System.out.println("--------------------------------------\n");
                continue;
            }

        }
    }
}




