package com.epam.training.zaryna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CustomerActions actions =new CustomerActions();
        ArrayOfCustomers arrayOfCustomers = actions.generateRandomCustomers(5);
        arrayOfCustomers.addCustomer("Lamanosava","Zaryna","Mix","Sun",23,45);
        actions.printCustomers(arrayOfCustomers);

        System.out.println("Сортировка имени по алфавиту: ");

        actions.sortCustomersByName(arrayOfCustomers);
        actions.printCustomers(arrayOfCustomers);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Задайте два числа(номер кредитной карты): минимальное и максимальное, диапазон от 10 до 100: ");
        try {
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            if(min>max){
                System.out.println("Максимальное значение должно быть больше минимального");
            }
            else {
                ArrayOfCustomers sortedArrayOfCustomers=actions.sortCustomersByCredit(arrayOfCustomers,min, max);
                actions.printCustomers(sortedArrayOfCustomers);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неправильный ввод данных");
        }

    }



}
