package com.company.zaryna.epam.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        //   Определить, будут ли они расположены на одной прямой.
        //A(1, 8), B(-2, -7), C(-4, -17) лежат на одной прямой

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates dot A:");
        System.out.println("Enter x1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        //
        System.out.println("Enter coordinates dot B:");
        System.out.println("Enter x2 ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates dot C:");
        System.out.println("Enter x3 ");
        int x3 = sc.nextInt();
        System.out.println("Enter y3");
        int y3 = sc.nextInt();
        if (x1 * y2 + x3 * y1 + x2 * y3 - x3 * y2 - x2 * y1 - x1 * y3 == 0) {
            System.out.println("лежат на одной прямой");
        } else {
            System.out.println("не лежат на одной прямой");
        }

    }
}
