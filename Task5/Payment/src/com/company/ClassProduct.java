package com.company;

/**
    Класс для представления продукта.
    Возможности:
    1) изменение имени, веса, цены продукта
    2) получение имени, веса, цены продукта
    3) вывод на консоль
 **/

public class ClassProduct {
    private String name;
    private double price;
    private double weight;


    public ClassProduct(){
        name="name";
    }

    public ClassProduct(String name, double weight, double price){
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public void setPrice(double cost){
        if(cost>0){
            this.price=cost;
        }
    }

    public void setWeight(double weight){
        if(weight>0){
            this.weight=weight;
        }
    }

    public void setName(String productName){
        if(productName!=null && !productName.isEmpty()) {
            this.name = productName;
        }
    }

    public double getPrice(){
        return price;
    }

    public double getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ", name " + name
                + ",  weight " + weight
                + ", price " + price;
    }

    @Override
    public boolean equals(Object object){
        if(object == this){
            return true;
        }

        if(object==null || object.getClass() != this.getClass()){
            return false;
        }

        ClassProduct other=(ClassProduct) object;

        return name.equals(other.name) && weight==other.weight && price==other.price;
    }

    @Override
    public int hashCode(){
        int number=10;
        int result=1;

        result=number*result+((name==null)?0:name.hashCode());
        result=number*result+Double.hashCode(weight);
        result=number*result+Double.hashCode(price);

        return result;
    }
}