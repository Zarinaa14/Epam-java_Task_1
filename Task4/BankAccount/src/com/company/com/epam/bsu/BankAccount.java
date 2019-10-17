package com.company.com.epam.bsu;
/**
    Класс для представления банковского счета.
    Возможности:
    1) изменение имени, баланса счета
    2) (раз)блокировка счета
    3) депозит на счет
    4) снятие денег со счета
    5) проверка на полож/отриц баланс
    6) вывод информации на консоль
 **/
public class BankAccount {
    private double balance;
    private boolean isBlockBalance;
    private String nameOfCustomer;


    public BankAccount(){
        nameOfCustomer="";
    }

    public BankAccount(double balance){
        setBalance(balance);
    }


    public BankAccount(String nameOfCustomer,double balance){
        setNameOfCustomer(nameOfCustomer);
        setBalance(balance);
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setNameOfCustomer(String nameOfCustomer){
        if(nameOfCustomer !=null && !nameOfCustomer.isEmpty()) {
            this.nameOfCustomer = nameOfCustomer;
        }
    }

    public String getNameOfCustomer(){
        return nameOfCustomer;
    }

    public double getBalance(){
        return balance;
    }

    public boolean block(){
        isBlockBalance =true;
        return true;
    }

    public boolean unlock(){
        isBlockBalance =false;
        return false;
    }



    public boolean isPositiveBalance(){
        return balance>0;
    }


    public boolean isNegativeBalance(){
        return balance<0;
    }


    public void newMoney(double money){
        if(!isBlockBalance){
            balance+=money;
        }else{
            System.out.println("\nРазблакируйте счет!");
        }
    }

    //Снять деньги со счета
    public void withdrawMoney(double money){
        if(!isBlockBalance){
            balance-=money;
        }else{
            System.out.println("\nРазблакируйте счет!");
        }
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Name of customer: " + nameOfCustomer
                + ", balance " + balance;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        BankAccount other=(BankAccount) obj;

        return nameOfCustomer.equals(other.nameOfCustomer) && balance==other.balance && isBlockBalance ==other.isBlockBalance;
    }

    @Override
    public int hashCode(){
        final int number=10;
        int result=1;

        result=number*result+((nameOfCustomer ==null)?0: nameOfCustomer.hashCode());
        result=number*result+Double.hashCode(balance);
        result=number*result+Boolean.hashCode(isBlockBalance);

        return result;
    }
}
