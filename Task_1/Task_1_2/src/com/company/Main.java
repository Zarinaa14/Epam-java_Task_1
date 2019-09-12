package com.company;

import java.util.Scanner;
//. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (𝑏 + √𝑏^2 + 4𝑎𝑐 )/2𝑎 − 𝑎^3*𝑐 + 𝑏^(−2)
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double y;
            System.out.println(" Enter a: ");
            double a = sc.nextDouble();
            System.out.println(" Enter b: ");
            double b = sc.nextDouble();
            System.out.println(" Enter c: ");
            double c = sc.nextDouble();
            //double sqrt(double d)
         double z =Math.pow(b,2)+4*a*c;
        y = (double)(b+Math.sqrt(z))/2*a-Math.pow(a,3)*c+Math.pow(b,-2);
        //double k=-10+Math.pow(b,-2);
        System.out.printf(" summa %f", y);
        sc.close();
    }
}
