package com.company;

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

    protected int getId(){
        return id;
    }

    protected String getSurname(){
        return surname;
    }

    protected String getName(){
        return name;
    }

    protected String getPatronymic(){
        return patronymic;
    }

    protected String getAdress(){
        return adress;
    }

    protected int getCreditCard(){
        return numberCreditCard;
    }

    protected int getBankAccount(){
        return numberBankAccount;
    }

    protected void setId(int id){
        if(id>0) {
            this.id = id;
        }
    }

    protected void setSurname(String surname){
        if(surname!=null && !surname.isEmpty()) {
            this.surname = surname;
        }
    }
    protected void setName(String name){
        if(name!=null && !name.isEmpty()) {
            this.name = name;
        }
    }

    protected void setPatronymic(String patronymic){
        if(patronymic!=null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        }
    }

    protected void setAdress(String adress){
        if(adress!=null && !adress.isEmpty()) {
            this.adress = adress;
        }
    }

    protected void setNumberCreditCard(int creditCard){
            this.numberCreditCard = creditCard;
    }

    protected void setNumberBankAccount(int bankAccount){
            this.numberBankAccount = bankAccount;
    }
    protected void print(){
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
