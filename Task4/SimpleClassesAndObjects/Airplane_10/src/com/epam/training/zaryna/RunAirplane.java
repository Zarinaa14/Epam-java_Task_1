package com.epam.training.zaryna;

/**  Создать класс Airplane, спецификация которого приведена ниже.
 Определить конструкторы, set- и get- методы и метод  toString().
 Создать второй класс, агрегирующий массив типа Airplane, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.

 Airplane: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 Найти и вывести:
 a) список рейсов для заданного пункта назначения;
 b) список рейсов для заданного дня недели;
 c) список рейсов для заданного дня недели, время вылета для которых больше заданного. **/
import java.util.Scanner;

public class RunAirplane {

    public static void main(String[] args) {
        ArrayAirplanes arrayAirplanes = new ArrayAirplanes(10);

        String[] arrayPlaneType = {"Airbus A330", "Boeing-737", "Airbus A567", "Boeing-747", "Boeing-777", "Boeing-767", "Boeing-524", "Airbus B567", "Airbus H876"};
        int[] arrayFlightNumber = {4533, 5543, 7654, 9876, 3211, 2345, 4456, 5456, 5443, 6676};
        String[] arrayOfDestination = {"Minsk", "Moscow", "Poland", "Italy", "Spain", "Egypt", "France", "Netherlands", "Russia", "Ukraine"};
        String[] arrayOfDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        arrayAirplanes.getRandomAirline(arrayOfDestination, arrayFlightNumber, arrayPlaneType, arrayOfDays);
        arrayAirplanes.print();
        Info info =new Info();
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
            info.printInfo();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Задайте любой пункта назначения с большой буквы, который написан выше: \n");
                String destination = scanner.next();
                System.out.println("Данные по заданному пункту назначения: ");
                arrayAirplanes.getFlightsToDestination(destination);
                info.printLine();
                continue;
            }
            if (choice == 2) {
                info.printDayOfWeek();
                String day = scanner.next();
                System.out.println("Данные по заданному дню недели: ");
                arrayAirplanes.getDays(day);
                info.printLine();
                continue;
            }
            if (choice == 3) {
                info.printDayOfWeek();
                String day = scanner.next();
                System.out.println("Задайте часы: \n");
                int h = scanner.nextInt();
                System.out.println("Задайте минуты: \n");
                int m = scanner.nextInt();
                System.out.println("Задайте секунды: \n");
                int s = scanner.nextInt();
                if(h<25&&m<61&&h<61&&h>=0&&m>=0&&s>=0) {
                    System.out.println("Данные по заданному дню недели,время вылета для которых больше заданного: ");
                    arrayAirplanes.getFlightsForDay(day, new Time(h, m, s));
                }else System.out.println("Неверный формат данных ");
                info.printLine();
                continue;
            }
        }
    }
}





