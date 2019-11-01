package com.epam.training.zaryna;

/**
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:  a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 **/

public class ArrayOfCustomers {

    public Customer[] customers = new Customer[0];

    public void setCustomers(Customer[] array) {
        customers = array;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getLengthArrayOfCustomer() {
        return customers.length;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.length) {
            return customers[index];
        } else {
            throw new IllegalArgumentException("Индекс выходит за пределы массива!");
        }
    }

    public void addCustomer(String surname, String name, String patronymic, String address, int numCreditCard, int numberBankAccount) {
        int lengthCustomers = getLengthArrayOfCustomer();
        Customer[] newCustomers = new Customer[lengthCustomers + 1];

        int i = 0;
        for (Customer customer : customers) {
            newCustomers[i] = customer;
            i++;
        }
        newCustomers[newCustomers.length - 1] = new Customer(surname, name, patronymic, address, numCreditCard, numberBankAccount);
        setCustomers(newCustomers);
    }

    @Override
    public String toString() {
        if (customers.length > 0) {
            StringBuilder res = new StringBuilder();
            for (Customer customer : customers) {
                res.append(customer);
                res.append("\n");
            }
            return res.toString();
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

        boolean isEqual = other.getLengthArrayOfCustomer() == this.getLengthArrayOfCustomer();

        for (int i = 0; isEqual && i < this.getLengthArrayOfCustomer(); i++) {
            if (!customers[i].equals(other.getCustomers()[i])) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;

        for (int i = 0; i < this.getLengthArrayOfCustomer(); i++) {
            result = result * prime + customers[i].hashCode();
        }

        return result;
    }

}
