package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                //   Задание 1 (циклы). Напишите программу, где пользователь вводит любое целое положительное число.
                //    программа суммирует все числа от 1 до введенного пользователем числа.
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter:  ");
                int x = sc.nextInt();
                int  k = 0;
                for (int i = 1; i <= x; i++){
                    k+=i;
                }
                System.out.println("Sum of numbers from one is " + k);
                sc.close();
            }
}
