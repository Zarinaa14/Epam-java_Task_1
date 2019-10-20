package com.company.com.company.epam.train;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayOfCustomers arrayOfCustomers =new ArrayOfCustomers(5);
        String[] surname = new String[] { "Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "El" };
        String[] name = new String[] { "Валентин", "Дима", "Женя", "Оля", " Коля", "Ваня", "Оля", "Максим", "Андрей", "Андрей" };
        String[] patronymic = new String[] { "Евгенович", " Петрович", "Алексеевич", "Михайловна", "Едуардов", "Васильевич", "Евгеньевна", "Павлович", "Анатольевич", "Владиславович" };
        String[] address =new String[] {"Sun","Sunshine","Gore","Monday","Red","Bluestreet","Andervile","Litlewill","Rabovile","Ganover"};
        int[] numCreditCard =new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] numberBankAccount=new int[]{24,45,53,65,78,81,53,44,55,92};
        arrayOfCustomers.randomCustomer(5,surname,name,patronymic,address,numCreditCard,numberBankAccount);
        Customer[] cas =new Customer[6];
        arrayOfCustomers.addCustomer("Ламаносова","Зарина","Михайловна","Солнечная",23,45);
        arrayOfCustomers.print();

        System.out.println("Сортировка по алфавиту: ");
        arrayOfCustomers.arraySortAlphabet();
        arrayOfCustomers.print();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Задайте два числа: минимальное и максимальное, диапазон от 10 до 100: ");
        int min =scanner.nextInt();
        int max =scanner.nextInt();
        arrayOfCustomers=arrayOfCustomers.sortCustomersByCredit(min,max);
        arrayOfCustomers.print();
        System.out.println("_____________");
    }
}
