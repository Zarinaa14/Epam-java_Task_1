package com.company;

public class Main {

    public static void main(String[] args) {
        int k = 1;
        //a++;  //2  Постфиксный инкремент
        //++a;  //   Префиксный  инкремент
        int k1 = k++ + 1; //2
        int k2 = ++k + 1; //3
        System.out.println(k1);
        System.out.println(k2);
    }
}
