package com.company;

public class Main {

    public static void main(String[] args) {
        // 4. Найти сумму квадратов первых 200 чисел.
        int k=0;
        for (int i=1; i<=200; i++ ){
            k+=i*i;
        }
        System.out.println("произведения квадратов первых двухсот чисел: " + k);
    }
}
