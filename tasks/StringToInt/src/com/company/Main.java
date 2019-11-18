package com.company;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        String myString = "1234";

        int number1 = Integer.parseInt(myString);//1
        int number2 = Integer.valueOf(myString.trim());//2

        System.out.println(number2);

        int number3 = new Integer(myString).intValue();//3
        System.out.println(number3 + number2);
        DecimalFormat decimalFormat = new DecimalFormat("#");
        //int number4 = (int) decimalFormat.parse(myString);//4
        int number4 = decimalFormat.parse(myString).intValue();//5
        System.out.println(number4);
    }
}
