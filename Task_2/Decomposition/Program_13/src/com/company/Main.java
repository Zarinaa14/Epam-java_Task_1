package com.company;

import java.util.*;

//. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.


public class Main {


    private static boolean isTwinNumbers(int number1,int number2){
        return isPrime(number1)&&isPrime(number2)&&Math.abs(number1-number2)==2;
    }

    private static void printNumbers(int firstNumber, int lastNumber){
        if(firstNumber<lastNumber) {
            for (int i = firstNumber; i <= lastNumber - 2; i++) {
                if (isTwinNumbers(i, i + 2)) {
                    System.out.print("{" + i + "," + (i + 2) + "} ");
                }
            }
        }
    }
    private static boolean isPrime( int number) {
        boolean prime;
        if(number<=1) prime=false;
        else {
            prime = true;
            int i = 2;
            while (i*i<=number) {
                if (number % i != 0) {
                    i++;
                } else {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter some natural that is greater than 2:");
            int n = in.nextInt();
            while (n <= 2) {
                System.out.println("Enter a positive integer greater than 2!");
                n = in.nextInt();
            }

            printNumbers(n, 2 * n);

    }
}