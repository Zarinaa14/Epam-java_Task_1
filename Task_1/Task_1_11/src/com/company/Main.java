package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Задание 5 (тема Ветвления ). Вычислить значение функции:
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ведите x: ");
        double x = sc.nextDouble();

        double a, b;
        if (x<=3){
            b = Math.pow(x,2)-3*x+9;
            System.out.printf("Result 1: %.1f ", b);
        } else if (x > 3) {
            a = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("Result 2: %.1f ", a);
        }
    }
}


