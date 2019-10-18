package com.company.zaryna.epam.training;

import java.util.Scanner;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        String a = sc.nextLine();
        System.out.println("Enter number b: ");
        String b = sc.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        System.out.println("\n цифры, входящие в запись как первого так и второго числа: ");
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print("|" + b.charAt(j));
                }
            }
        }
    }
}
