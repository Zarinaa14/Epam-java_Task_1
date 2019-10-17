package com.company.com.company.epam.train;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private int numberCreditCard;
    private int numberBankAccount;
    int counterOfId=0;
    public Customer(){
        surname="";
        name="";
        patronymic="";
        adress="";
        numberCreditCard=0;
        numberBankAccount=0;
     id=+counterOfId;
     counterOfId++;
    }
    public Customer(String surname,String name,String patronymic,String adress,int numberCreditCard,int numberBankAccount){
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setAdress(adress);
        setNumberCreditCard(numberCreditCard);
        setNumberBankAccount(numberBankAccount);
    }

    public int getId(){
        return id;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public String getAdress(){
        return adress;
    }

    public int getCreditCard(){
        return numberCreditCard;
    }

    public int getBankAccount(){
        return numberBankAccount;
    }

    public void setId(int id){
        if(id>0) {
            this.id = id;
        }
    }

    public void setSurname(String surname){
        if(surname!=null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }
    public void setName(String name){
        if(name!=null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPatronymic(String patronymic){
        if(patronymic!=null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        }
    }

    public void setAdress(String adress){
        if(adress!=null && !adress.isEmpty()) {
            this.adress = adress;
        }
    }

    public void setNumberCreditCard(int creditCard){
            this.numberCreditCard = creditCard;
    }

    public void setNumberBankAccount(int bankAccount){
            this.numberBankAccount = bankAccount;
    }
    public void print(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Surname: " + surname
                + ", name " + name
                + ", patronymic " + patronymic
                + ", adress " + adress + ", numberCreditCard "+numberCreditCard+", numberBankAccount "+numberBankAccount;
    }

}
