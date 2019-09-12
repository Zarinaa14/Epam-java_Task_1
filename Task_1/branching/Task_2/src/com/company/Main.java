package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Ветвления/ 2. Найти max{min(a, b), min(c, d)}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();
        //
        int z = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println("The value of max{min(a, b), min(c, d)} is " + z);
        sc.close();
    }
}
