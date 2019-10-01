package com.company;

import java.util.Scanner;

public class Main {



//Вычислить значения функции на отрезке [а,b] c шагом h: 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println(" Ведите a: ");
        double a = sc.nextDouble();
        System.out.println(" Ведите b: ");
        double b = sc.nextDouble();
        System.out.println(" Ведите шаг h: ");
        double h = sc.nextDouble();

        for (double i = a; i <= b; i++) {
            x=a; //a=a+h;

            if (x >2){

                y=x;
                System.out.printf("if x>2, y=  %.1f ", y);
            } else if (2 >= x) {
                a=a+h;
                y=-x;
                System.out.printf("if x=<2: %.1f ", y);
            }
        }

        //a=0;b=7;
        //double a, b;

    }


}
