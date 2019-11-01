package com.epam.training.zaryna;

import java.util.Random;

/**
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:  a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 **/
public class CustomerActions {
    private static final String[] surname = new String[]{"Andrey", "Kolya", "Maksim", "Tim", "Marsel", "Daniel", "El"};
    private static final String[] name = new String[]{"Валентин", "Дима", "Женя", "Оля", " Коля", "Ваня", "Оля", "Максим", "Андрей", "Андрей"};
    private static final String[] patronymic = new String[]{"Евгенович", " Петрович", "Алексеевич", "Михайловна", "Едуардов", "Васильевич", "Евгеньевна", "Павлович", "Анатольевич", "Владиславович"};
    private static final String[] address = new String[]{"Sun", "Sunshine", "Gore", "Monday", "Red", "Bluestreet", "Andervile", "Litlewill", "Rabovile", "Ganover"};
    private static final int[] numCreditCard = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    private static final int[] numberBankAccount = new int[]{24, 45, 53, 65, 78, 81, 53, 44, 55, 92};


    public ArrayOfCustomers generateRandomCustomers(int size) {
        Random random = new Random();
        ArrayOfCustomers arrayOfCustomers = new ArrayOfCustomers();
        Customer[] customers = new Customer[size];
        for (int i = 0; i < size; i++) {
            customers[i] = new Customer(surname[random.nextInt(7)], name[random.nextInt(9)], patronymic[random.nextInt(9)], address[random.nextInt(9)], numCreditCard[random.nextInt(9)], numberBankAccount[random.nextInt(7)]);
        }
        arrayOfCustomers.setCustomers(customers);
        return arrayOfCustomers;
    }

    // Отсортировать покупателей в алфавитном порядке.
    public void sortCustomersByName(ArrayOfCustomers arrayOfCustomers) {
        for (int i = 0; i < arrayOfCustomers.getLengthArrayOfCustomer(); i++) {
            for (int j = 0; j < arrayOfCustomers.getLengthArrayOfCustomer(); j++) {
                if (arrayOfCustomers.getCustomers()[j].getSurname().toLowerCase().compareTo(arrayOfCustomers.getCustomers()[i].getSurname().toLowerCase()) > 0) {
                    Customer tpm = arrayOfCustomers.getCustomers()[j];
                    arrayOfCustomers.getCustomers()[j] = arrayOfCustomers.getCustomers()[i];
                    arrayOfCustomers.getCustomers()[i] = tpm;
                }
            }
        }
    }

    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public ArrayOfCustomers sortCustomersByCredit(ArrayOfCustomers arrayOfCustomers, int startOfMerge, int endOfMerge) {
        ArrayOfCustomers sortedArrayOfCustomers = new ArrayOfCustomers();

        int countCustomer = 0;
        for (Customer customer : arrayOfCustomers.getCustomers()) {
            if (customer.getCreditCard() >= startOfMerge && customer.getCreditCard() <= endOfMerge) {
                countCustomer++;
            }
        }
        if (countCustomer > 0) {

            Customer[] newCustomers = new Customer[countCustomer];

            int i = 0;
            for (Customer customer : arrayOfCustomers.getCustomers()) {
                if (customer.getCreditCard() >= startOfMerge && customer.getCreditCard() <= endOfMerge) {
                    newCustomers[i] = customer;
                    i++;
                }
            }
            sortedArrayOfCustomers.setCustomers(newCustomers);
        }
        return sortedArrayOfCustomers;
    }


    public void printCustomers(ArrayOfCustomers arrayOfCustomers) {
        System.out.println(arrayOfCustomers);
    }

}
