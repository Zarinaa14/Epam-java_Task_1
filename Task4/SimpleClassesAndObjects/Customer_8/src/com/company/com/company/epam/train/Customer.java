package com.company.com.company.epam.train;
// Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int numberCreditCard;
    private int numberBankAccount;
    int counterOfId = 0;

    public Customer() {
        surname = "null";
        name = "null";
        patronymic = "null";
        address = "null";
        numberCreditCard = 0;
        numberBankAccount = 0;
        id = +counterOfId;
        counterOfId++;
    }

    public Customer(String surname, String name, String patronymic, String address, int numberCreditCard, int numberBankAccount) {
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setAddress(address);
        setNumberCreditCard(numberCreditCard);
        setNumberBankAccount(numberBankAccount);
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCard() {
        return numberCreditCard;
    }

    public int getBankAccount() {
        return numberBankAccount;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPatronymic(String patronymic) {
        if (patronymic != null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
    }

    public void setNumberCreditCard(int creditCard) {
        this.numberCreditCard = creditCard;
    }

    public void setNumberBankAccount(int bankAccount) {
        this.numberBankAccount = bankAccount;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Surname: " + surname
                + ", name " + name
                + ", patronymic " + patronymic
                + ", address " + address + ", numberCreditCard " + numberCreditCard + ", numberBankAccount " + numberBankAccount;
    }

}
