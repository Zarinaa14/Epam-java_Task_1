package com.company;

public class Main {

    public static void main(String[] args) {
        int number =1234;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);//1
        String string2 =""+number;//2
        String string3=Integer.toString(number);//3
        String string4 = String.valueOf(number);//4
        String string5=String.format("%d",number);//5



    }
}
