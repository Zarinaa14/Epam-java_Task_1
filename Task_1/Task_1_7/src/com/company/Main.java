package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //  . Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
        //  то будет ли он прямоугольным.50
        final int SUM_OF_ANGLE = 180;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
         a = sc.nextInt();
        //
        System.out.println("Enter the two angle: ");
        b = sc.nextInt();
        //
        c = SUM_OF_ANGLE - (a + b);
        System.out.println("This is third angle: "+ c);
        //
         if (c>0 && SUM_OF_ANGLE - (c + a + b) == 0)
         {System.out.println("This is a triangle");
             if (c == 90 || a == 90 || b == 90)
             { System.out.println("Rectangular triangle");}
         }
         else {
            System.out.println("It's not triangle!!!");
        }
        sc.close();
    }
}
