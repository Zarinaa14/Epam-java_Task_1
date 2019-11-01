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
        ArrayAirplanes arrayAirplanes = new ArrayAirplanes();

      AirplaneActions action =new AirplaneActions();

        arrayAirplanes=action.getRandomAirline(6);
        arrayAirplanes.print();
        Info info =new Info();
        int choice = 1;
        while (choice != 5) {
            Scanner scanner = new Scanner(System.in);
            info.printInfo();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Задайте любой пункта назначения с большой буквы, который написан выше: \n");
                String destination = scanner.next();
                System.out.println("Данные по заданному пункту назначения: ");
                ArrayAirplanes newArrayAirplanes = new ArrayAirplanes();
                newArrayAirplanes=action.getFlightsToDestination(arrayAirplanes,destination);
                newArrayAirplanes.print();
                info.printLine();
                continue;
            }
            if (choice == 2) {
                info.printDayOfWeek();
                String day = scanner.next();
                System.out.println("Данные по заданному дню недели: ");
                ArrayAirplanes newArrayAirplanes = new ArrayAirplanes();
                newArrayAirplanes=action .getDays(arrayAirplanes,day);
                newArrayAirplanes.print();
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
                    ArrayAirplanes newArrayAirplanes = new ArrayAirplanes();
                    newArrayAirplanes= action.getFlightsForDay(arrayAirplanes,day, new Time(h, m, s));
                    newArrayAirplanes.print();
                }else System.out.println("Неверный формат времени ");
                info.printLine();
                continue;
            }
            if (choice == 4) {
                info.printDayOfWeek();
                arrayAirplanes.print();
                info.printLine();
                continue;
            }
        }
    }
}





