package com.company;

import java.util.Scanner;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Main {
    private static int numberOfDigits(int num){
        int size=0;

        while(num>0){
            size++;
            num/=10;
        }
        return size;
    }

    private static int calculateMaxDigits(int num1, int num2){
        int hasMoreDigits;
        if(numberOfDigits(num1)>= numberOfDigits(num2)){
            hasMoreDigits = num1;
        }else{
            hasMoreDigits = num2;
        }

        return hasMoreDigits;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter number :");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Max (" + num1 + "," + num2 + ") в " + calculateMaxDigits(num1, num2));

    }
}