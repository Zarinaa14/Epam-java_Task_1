package com.company;

/**
    Класс для представления тур. путевки
    Возможности:
    1) изменение кол-ва дней,цены, питания, транспорта, типа
    2) получение кол-ва дней,цены, питания, транспорта, типа
    3) выбор/отмена путевки
    4) вывод на консоль
 **/

public class TravelVouncher {
    private String typeTravel;
    private int numberOfDays;
    private double price;
    private String typeFood;
    private String transport;



    protected TravelVouncher(){
        transport="транспорт";
        typeTravel ="тип путевки";
        typeFood ="тип питания";
    }

    protected TravelVouncher(int typeChoise,int foodChoice,int transportChoice,int numOfDays,double cost){
        setNumberOfDays(numOfDays);
        setPrice(cost);
        setTypeFood(foodChoice);
        setTransport(transportChoice);
        setTypeTravel(typeChoise);
    }

    protected void setNumberOfDays(int days){
        if(days>0){
            this.numberOfDays =days;
        }
    }

    protected void setPrice(double price){
        if(price >0){
            this.price = price;
        }
    }

    protected void setTypeFood(int choice){
        switch (choice){
            case 1:{
                typeFood ="all inclusive";
                break;
            }

            case 2:{
                typeFood ="breakfast";
                break;
            }

            case 3:{
                typeFood ="завтрак и ужин";
                break;
            }
            default:{
                typeFood ="breakfast and dinner";
            }
        }
    }

    protected void setTransport(int choice){
        switch (choice){
            case 1:{
                transport="by plane";
                break;
            }

            case 2:{
                transport="by train";
                break;
            }

            case 3:{
                transport="by bus";
                break;
            }

            default:{
                transport="transport";
            }
        }
    }

    protected void setTypeTravel(int choice){
        switch (choice){
            case 1:{
                typeTravel ="rest";
                break;
            }

            case 2:{
                typeTravel ="trip";
                break;
            }

            case 3:{
                typeTravel ="treatment";
                break;
            }

            case 4:{
                typeTravel ="shopping";
                break;
            }

            case 5:{
                typeTravel ="cruise";
                break;
            }

            default:{
                typeTravel ="type of tour";
            }
        }
    }

    protected int getNumberOfDays(){
        return numberOfDays;
    }

    protected double getPrice(){
        return price;
    }

    protected String getTypeFood(){
        return typeFood;
    }

    protected String getTransport(){
        return transport;
    }

    protected String getTypeTravel(){
        return typeTravel;
    }


    protected void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return " Тип поездки: " + typeTravel
                + ", вид транспорта " + transport + ", тип еды " + typeFood + ", цена " + price + ", количество дней " + numberOfDays;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        TravelVouncher other=(TravelVouncher) obj;

        return typeTravel.equals(other.typeTravel) && numberOfDays ==other.numberOfDays && price ==other.price
                && transport.equals(other.transport) && typeFood.equals(other.typeFood);
    }

    @Override
    public int hashCode(){
        final int number=10;
        int result=1;

        result=number*result+ numberOfDays;
        result=number*result+Double.hashCode(price);
        result=number*result+((typeFood ==null)?0: typeFood.hashCode());
        result=number*result+((transport==null)?0:transport.hashCode());
        result=number*result+((typeTravel ==null)?0: typeTravel.hashCode());

        return result;
    }
}
