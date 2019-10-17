package com.company.com.company.epam.train;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskCustomer  taskCustomer =new TaskCustomer(4);
        String[] surname = new String[] { "Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "El" };
        String[] name = new String[] { "Валентин", "Дима", "Женя", "Оля", " Коля", "Ваня", "Оля", "Максим", "Андрей", "Андрей" };
        String[] patronymic = new String[] { "Евгенович", " Петрович", "Алексеевич", "Михайловна", "Едуардов", "Васильевич", "Евгеньевна", "Павлович", "Анатольевич", "Владиславович" };
        String[] adress =new String[] {"Sun","Sunshine","Gore","Monday","Red","Bluestreet","Andervile","Litlewill","Rabovile","Ganover"};
        int[] numCreditCard =new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] numberBankAccount=new int[]{24,45,53,65,78,81,53,44,55,92};
        taskCustomer.runCustomer(surname,name,patronymic,adress,numCreditCard,numberBankAccount);
        taskCustomer.print();
        taskCustomer.arraySortAlphabet();
        System.out.println("Сортировка по алфавиту: ");
        taskCustomer.print();
        Scanner scaner =new Scanner(System.in);
        System.out.println("Задайте два числа, диапазон от 10 до 100: ");
        int min =scaner.nextInt();
        int max =scaner.nextInt();
        taskCustomer.sortCustombersByCredit(min,max );
        System.out.println("_____________");
        //taskCustomer.print();

    }
}
