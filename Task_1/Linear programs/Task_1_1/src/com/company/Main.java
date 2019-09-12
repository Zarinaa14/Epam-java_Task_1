package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Найдите  значение функции:  z = ( (a – 3 ) * b / 2) + c.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        //
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        //
        System.out.print("Введите b: ");
        double c = in.nextDouble();
        //
        double z = ((a - 3) * b / 2)+ c;
        System.out.println("Double: " + z);
        in.close();
    }
}
