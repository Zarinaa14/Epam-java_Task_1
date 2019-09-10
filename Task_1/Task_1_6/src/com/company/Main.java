package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //  Для данной области составить линейную программу, которая печатает true,
        //  если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        if ( -3 <= y && y <= 0 && -4 <= x && x <= 4 ){
            System.out.println("Точка принадежит данной области! ");
        }
        else if ( 0 <= y && y <= 4 && -2 <=x && x <= 2  ){
            System.out.println("Точка принадежит данной области! ");
        } else
            System.out.println("Точка не принадежит данной области! ");
        sc.close();
    }
}
