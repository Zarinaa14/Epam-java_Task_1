package com.company.com.company.epam.train;

/**
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:  a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 **/

import java.util.Random;


public class ArrayOfCustomers {
    public Customer[] arrayOfCustomer;
    Random random = new Random();

    public ArrayOfCustomers(int numberCustomers) {
        if (numberCustomers > 0) {
            arrayOfCustomer = new Customer[numberCustomers];
            for (int i = 0; i < numberCustomers; i++) {
                arrayOfCustomer[i] = new Customer();
            }
        }
    }

    public ArrayOfCustomers(Customer[] array) {
        setArrayOfCustomer(array);
    }

    public void setArrayOfCustomer(Customer[] array) {
        if (array != null) {
            arrayOfCustomer = new Customer[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayOfCustomer[i] = array[i];
            }
        }
    }

    public Customer[] getArrayOfCustomer() {
        return arrayOfCustomer;
    }

    public int getLengthArrayOfCustomer() {
        return arrayOfCustomer.length;
    }

    public Customer[] randomCustomer(int numberCustomer, String[] surname, String[] name, String[] patronymic, String[] address, int[] numCreditCard, int[] numberBankAccount) {
        if (arrayOfCustomer != null) {
            for (int i = 0; i < numberCustomer; i++) {
                arrayOfCustomer[i] = new Customer(surname[random.nextInt(7)], name[random.nextInt(9)], patronymic[random.nextInt(9)], address[random.nextInt(9)], numCreditCard[random.nextInt(9)], numberBankAccount[random.nextInt(7)]);
            }
        }
        return arrayOfCustomer;
    }



    public Customer getCustomer(int index) {
        if (index >= 0 && index < getSize()) {
            return arrayOfCustomer[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }

    public int getSize() {
        if (arrayOfCustomer != null) {
            return arrayOfCustomer.length;
        } else {
            return 0;
        }
    }

    public void print() {
        System.out.println(toString());
    }

    // Отсортировать покупателей в алфавитном порядке.
    public void arraySortAlphabet() {
        for (int i = 0; i < arrayOfCustomer.length; i++) {
            for (int j = 0; j < arrayOfCustomer.length; j++) {
                if (arrayOfCustomer[j].getSurname().toLowerCase().compareTo(arrayOfCustomer[i].getSurname().toLowerCase()) > 0) {

                    Customer tpm = arrayOfCustomer[j];
                    arrayOfCustomer[j] = arrayOfCustomer[i];
                    arrayOfCustomer[i] = tpm;
                }
            }
        }
    }


    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public ArrayOfCustomers sortCustomersByCredit(int startOfMerge, int endOfMerge) {
        if (arrayOfCustomer == null) {
            throw new IllegalArgumentException("Массив нулевой длины");
        }
        int lengthCustomers = getLengthArrayOfCustomer();
        int countCustomer = 0;
        for (Customer customer : arrayOfCustomer) {
            if (customer.getCreditCard() >= startOfMerge && customer.getCreditCard() <= endOfMerge) {
                customer.print();
                countCustomer++;
            }
        }
        if (countCustomer > 0) {

            Customer[] newCustomers = new Customer[lengthCustomers];

            int i = 0;
            for (Customer customer : arrayOfCustomer) {
                if (customer.getCreditCard() >= startOfMerge && customer.getCreditCard() <= endOfMerge) {
                    newCustomers[i] = customer;
                    i++;
                }
            }

            return new ArrayOfCustomers(newCustomers);
        } else {
            Customer[] customers = new Customer[1];
            customers[0] = new Customer();

            return new ArrayOfCustomers(customers);
        }
    }

    @Override
    public String toString() {
        if (arrayOfCustomer != null) {
            String res = new String();
            for (Customer customer : arrayOfCustomer) {
                res += customer.toString() + "\n";
            }

            return res;

        } else {
            return "Покупатели отсутствуют!";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayOfCustomers other = (ArrayOfCustomers) obj;

        boolean isEqual = other.getSize() == getSize();

        for (int i = 0; isEqual && i < getSize(); i++) {
            if (!arrayOfCustomer[i].equals(other.getArrayOfCustomer()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        for (int i = 0; i < getSize(); i++) {
            result = result * prime + arrayOfCustomer[i].hashCode();
        }

        return result;
    }

}
