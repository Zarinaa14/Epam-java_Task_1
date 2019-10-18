package com.epam.training.zaryna;
import java.util.Scanner;
/**
 * Заданиие 7 из циклов. Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  m ");
        int m = sc.nextInt();
        System.out.println("Enter n ");
        int n = sc.nextInt();
        while (m <= n) {
            System.out.print("\n number: " + m);
            System.out.print(" its dividers: ");
            for (int i = 2; i <= m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + ",");
                }
            }
            m = m + 1;
        }
    }
}
