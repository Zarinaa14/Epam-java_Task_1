package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // задание 5( Циклы). Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
        // модуль которых больше или равен заданному е. Общий член ряда имеет вид: a =  1/2^n + 1/3^n;

        System.out.println("Input е");
        Scanner sc = new Scanner(System.in);
        double k =  sc.nextDouble();

        int n = 0;
        double sum = 0;
        System.out.println("сумму тех членов рядамодуль которых больше или равен заданному е: ");
        for (int i = 0; i<=10; i++){
            ++n;
            System.out.print("\n");
            double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            System.out.printf("%.4f", a);
            if (k <= Math.abs(a))
                sum = sum+a;
            System.out.printf(" summa %f", sum);

        }
        sc.close();
    }

}