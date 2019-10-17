package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayAndProcessInTravel agency = new ArrayAndProcessInTravel(1);
        Scanner scanner = new Scanner(System.in);
        Info info =new Info();


            int choice = 0;
            int extraChoice;
            while (choice != 10) {

                info.printInfo();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1: {

                        System.out.println("\nВведите тип путевки:\n 1 - отдых\n 2 - экскурсии\n 3 - лечение\n 4 - шопинг\n 5 - круиз");
                        int type=scanner.nextInt();
                        System.out.println("\nВведите тип питания:\n 1 - все включено\n 2 - завтрак\n 3 - завтрак + ужин");
                        int food=scanner.nextInt();
                        System.out.println("\nВведите вид транспорта:\n1 - самолет\n2 - поезд\n3 - автобус\n");
                        int transport=scanner.nextInt();
                        System.out.println("\nВведите количество дней");
                        int numberDays=scanner.nextInt();
                        System.out.println("\nВведите цену");
                        double cost=scanner.nextDouble();
                        agency.addVouncher(type, food, transport,numberDays, cost);
                        System.out.println("\n--------------------------------------------------------");
                        break;
                    }

                    case 2: {
                        System.out.println("\nВведите 1 для удаления путевок дороже указанной цены");
                        System.out.println("Введиет 2 для удаления путевки по ее порядковому номеру");
                        extraChoice = scanner.nextInt();

                        switch (extraChoice) {
                            case 1: {
                                System.out.println("\nВведите цену");
                                agency.deleteVouncher(scanner.nextDouble());
                                break;
                            }

                            case 2: {
                                System.out.println("\nВведите номер путевки");
                                agency.deleteVouncher(scanner.nextInt() - 1);
                                break;
                            }
                        }
                        break;
                    }


                    case 3: {
                        agency.sortByPrice();
                        break;
                    }

                    case 4: {
                        agency.sortByType();
                        break;
                    }

                    case 5: {
                        agency.print();
                        break;
                    }
                }
            }

    }
}