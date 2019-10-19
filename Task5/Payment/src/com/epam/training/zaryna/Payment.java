package com.epam.training.zaryna;

import java.util.*;

/*
    Класс для представления платежа(коллекция продуктов)
    Возможности:
    1) добавление/удаление продукта
    2) сортировка продуктов по различным параметрам
    3) получение общей цены/веса
    4) печать чека на консоль
 */

public class Payment {

    private ArrayList<ClassProduct> products=new ArrayList<ClassProduct>();

    public Payment(){

    }
    public Payment(int size){
        for(int i=0;i<size;i++){
            products.add(new ClassProduct());
        }
    }

    public void addProduct(String name,double weight,double price){
        products.add(new ClassProduct(name,weight,price));
    }

    public void setProduct(int index,String name,double weight,double price){
        if(index>=0 && price <products.size()&& name!=null) {
            products.set(index, new ClassProduct(name, weight, price));
        }
    }

    public void deleteProduct(int index){
        if(index>=0 && index<products.size()){
            products.remove(index);
        }
    }

    public void deleteProduct(String name,double weight,double price){
        products.remove(new ClassProduct(name,weight,price));
    }

    public void sortByPrice(){
        Collections.sort(products,new ProductPriceComparator());
    }

    protected void sortByWeight(){
       Collections.sort(products,new ProductWeightComparator());
    }

    public void sortByName(){
      Collections.sort(products,new ProductNameComparator());
    }

    public double getTotalPrice(){
        double price=0;

        for(ClassProduct product:products){
            price+=product.getPrice();
        }

        return (double)Math.round(price*100d)/100d;
    }

    public double getTotalWeight(){
        double weight=0;

        for(ClassProduct product:products){
            weight+=product.getWeight();
        }

        return (double)Math.round(weight*100d)/100d;
    }

    public void print(){
        System.out.println("\n Общая сумма = "+getTotalPrice());
        System.out.println(" Общий вес = "+getTotalWeight()+"\n");
        System.out.println(toString());
    }

    @Override
    public String toString(){
        String string=new String();

        for(int i=0;i<products.size();i++){
            string+=(i+1)+products.get(i).toString()+"\n";
        }

        return string;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }

        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }

        Payment payment=(Payment) obj;

        boolean isEqual=true;

        for(int i=0;i<products.size();i++){
            if(!products.get(i).equals(payment.products.get(i))){
                isEqual=false;
                break;
            }
        }

        return isEqual;
    }



    @Override
    public int hashCode(){
        int num=31;
        int result=1;

        for(ClassProduct product:products){
            result=num*result+product.hashCode();
        }

        return result;
    }
}