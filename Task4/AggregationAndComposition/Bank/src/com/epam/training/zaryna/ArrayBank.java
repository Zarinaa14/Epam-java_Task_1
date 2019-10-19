package com.epam.training.zaryna;

 /*
    Коллекция(массив) счетов.
    Возможности:
    1) (раз)блокировка всех/отдельных счетов
    2) сортировка счетов по различным параметрами
    3) поиск счета
    4) получение общего баланса
    5) получение общего полож/отриц баланса
    6) добавление/удаление счетов
    7) депозит/снятие денег на/со счета(-а)
 */

import java.util.Random;

public class ArrayBank {

    public BankAccount[] arrayOfAccounts;

    public ArrayBank(int size) {
        if (size > 0) {
            arrayOfAccounts = new BankAccount[size];
            for (int i = 0; i < size; i++) {

                arrayOfAccounts[i] = new BankAccount();
            }
        }
    }

    public ArrayBank(BankAccount[] newAccounts) {
        setProcessOfBankAccount(arrayOfAccounts);
    }

    public void setProcessOfBankAccount(BankAccount[] arr) {
        arrayOfAccounts = new BankAccount[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayOfAccounts[i] = arr[i];
        }
    }

    public int getSize() {
        return arrayOfAccounts.length;
    }

    public BankAccount[] getArrayOfAccounts() {
        return arrayOfAccounts;
    }

    public BankAccount getBankAccount(int index) {
        if (index >= 0 && index < getSize()) {
            return arrayOfAccounts[index];
        } else {
            throw new IllegalArgumentException("Выход за пределы массива!");
        }
    }

    public void getRandomBankAccounts(String[] name, int[] arrayBalance) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayOfAccounts[i] = new BankAccount(name[random.nextInt(7)], arrayBalance[random.nextInt(10)]);
        }
    }

    public void blockAllBankAccounts() {
        for (BankAccount account : arrayOfAccounts) {
            account.block();
        }
    }


    public void block(int index) {
        if (index >= 0 && index < getSize()) {
            arrayOfAccounts[index].block();
        }
    }

    //Разблокировать все счета
    public void unlockAll() {
        for (BankAccount account : arrayOfAccounts) {
            account.unlock();
        }
    }

    //Разблокировать счет с индексом index
    public void unlock(int index) {
        if (index >= 0 && index < getSize()) {
            arrayOfAccounts[index].unlock();
        }
    }

    public void block(String str, double balance) {
        int count = 0;
        if (str != null && !str.isEmpty()) {
            for (int i = 0; i < arrayOfAccounts.length; i++) {
                if (arrayOfAccounts[i].getNameOfCustomer().compareTo(str) == 0 && arrayOfAccounts[i].getBalance() == balance) {
                    arrayOfAccounts[i].block();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Данных нет, введите правильные данные");
            }
        }
    }


    public double getTotalBalance() {
        double total = 0;
        for (BankAccount account : arrayOfAccounts) {
            total += account.getBalance();
        }
        return total;
    }

    public double getTotalNegativeBalance() {
        double total = 0;
        for (BankAccount account : arrayOfAccounts) {
            if (account.isNegativeBalance()) {
                total += account.getBalance();
            }
        }
        return total;
    }

    public double getTotalPositiveBalance() {
        double total = 0;
        for (BankAccount account : arrayOfAccounts) {
            if (account.isPositiveBalance()) {
                total += account.getBalance();
            }
        }
        return total;
    }

    //Сортировка по балансу, если баланс равен, то сортируется по имени счета
    public void sortByBalance() {
        for (int i = 0; i < getSize() - 1; i++) {
            for (int j = 0; j < getSize() - i - 1; j++) {
                if (arrayOfAccounts[j].getBalance() > arrayOfAccounts[j + 1].getBalance()) {
                    change(j, j + 1);
                } else {
                    if (arrayOfAccounts[j].getBalance() == arrayOfAccounts[j + 1].getBalance()) {
                        if (arrayOfAccounts[j].getNameOfCustomer().compareTo(arrayOfAccounts[j + 1].getNameOfCustomer()) > 0) {
                            change(j, j + 1);
                        }
                    }
                }
            }
        }
    }

    //Сортировка по имени счета, если имена счетов совпадают, то сортируется по балансу
    public void sortByNameOfCustomer() {
        int time;

        for (int i = 0; i < getSize() - 1; i++) {
            for (int j = 0; j < getSize() - i - 1; j++) {
                if (arrayOfAccounts[j].getNameOfCustomer().compareTo(arrayOfAccounts[j + 1].getNameOfCustomer()) > 0) {
                    change(j, j + 1);
                } else {
                    if (arrayOfAccounts[j].getNameOfCustomer().compareTo(arrayOfAccounts[j + 1].getNameOfCustomer()) == 0) {
                        if (arrayOfAccounts[j].getBalance() > arrayOfAccounts[j + 1].getBalance()) {
                            change(j, j + 1);
                        }
                    }
                }
            }
        }
    }


    public void findCustomerByNameAndBalance(String name) {
        if (arrayOfAccounts.length > 0) {
            for (int i = 0, index = 0; i < getSize(); i++) {
                if (arrayOfAccounts[i].getNameOfCustomer().equals(name)) {
                    arrayOfAccounts[i].print();
                }
            }
        }
    }


    public void findCustomerBalance(double balance) {
        int num = 0;

        for (BankAccount account : arrayOfAccounts) {
            if (account.getBalance() == balance) {
                account.print();
            }
        }
    }

    //Поиск счетов по имени и балансу
    public ArrayBank findCustomerByNameAndBalance(String name, double balance) {
        int count = 0;

        for (BankAccount account : arrayOfAccounts) {
            if (account.getNameOfCustomer().equals(name) && account.getBalance() == balance) {
                count++;
            }
        }

        if (count > 0) {
            BankAccount[] newAccounts = new BankAccount[count];
            for (int i = 0, index = 0; i < getSize(); i++) {
                if (arrayOfAccounts[i].getNameOfCustomer().equals(name) && arrayOfAccounts[i].getBalance() == balance) {
                    newAccounts[index] = arrayOfAccounts[i];
                    index++;

                }
            }
            return new ArrayBank(newAccounts);


        }
        return null;
    }


    public void addBankAccount(String name, double deposit) {
        BankAccount[] newAccounts = new BankAccount[getSize() + 1];

        for (int i = 0; i < getSize(); i++) {
            newAccounts[i] = arrayOfAccounts[i];
        }

        newAccounts[getSize()] = new BankAccount(name, deposit);
        arrayOfAccounts = newAccounts;
    }


    public void deleteBankAccountByName(String name) {
        int numOfAccounts = getSize();

        for (BankAccount account : arrayOfAccounts) {
            if (account.getNameOfCustomer().equals(name)) {
                numOfAccounts--;
            }
        }

        if (numOfAccounts < getSize()) {
            BankAccount[] newAccounts = new BankAccount[numOfAccounts];
            for (int i = 0, index = 0; i < getSize(); i++) {
                if (!arrayOfAccounts[i].getNameOfCustomer().equals(name)) {
                    newAccounts[index] = arrayOfAccounts[i];
                    index++;
                }
            }

            arrayOfAccounts = newAccounts;
        }

    }

    //Вывод денег со счета с индексом index
    public void withdrawMoney(double money, int indexOfAccount) {
        if (indexOfAccount >= 0 && indexOfAccount < getSize()) {
            arrayOfAccounts[indexOfAccount].withdrawMoney(money);
        }
    }

    //Депозит на счет с индексом index
    public void depositMoney(double money, int indexOfAccount) {
        if (indexOfAccount >= 0 && indexOfAccount < getSize()) {
            arrayOfAccounts[indexOfAccount].newMoney(money);
        }
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String string = new String();
        for (BankAccount account : arrayOfAccounts) {
            string += account.toString() + "\n";
        }
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ArrayBank other = (ArrayBank) obj;
        boolean isEqual = true;

        for (int i = 0; i < getSize(); i++) {
            if (!arrayOfAccounts[i].equals(other.arrayOfAccounts[i])) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        final int number = 10;
        int result = 1;

        for (int i = 0; i < getSize(); i++) {
            result = number * result + arrayOfAccounts[i].hashCode();
        }

        return result;
    }

    public void change(int index1, int index2) {
        if (index1 >= 0 && index1 < getSize() && index2 >= 0 && index2 < getSize()) {
            BankAccount tpm = arrayOfAccounts[index1];
            arrayOfAccounts[index1] = arrayOfAccounts[index2];
            arrayOfAccounts[index2] = tpm;
        }
    }
}

