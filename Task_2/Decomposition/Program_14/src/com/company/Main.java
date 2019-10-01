package com.company;
import java.util.*;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

public class Main {
    private static int initDigit(int number, int n) {
        return (int) ((number / Math.pow(10, n - 1)) % 10);
    }

    private static int getNumOfDigits(int num){
        int size=0;

        while(num>0){
            size++;
            num/=10;
        }

        return size;
    }
    private static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result*=a;
        }

        return result;
    }
    private static boolean isArmstrongNumber(int num){
        int sum=0;
        int numOfDigits=getNumOfDigits(num);
        for(int i=1;i<=numOfDigits;i++){
            sum+=power(initDigit(num,i),numOfDigits);
        }

        return sum==num;
    }

    private static void printArmstrongNumbers( int last){
        for(int i=1;i<=last;i++){
            if(isArmstrongNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a natural number: ");
            int n = in.nextInt();

            while (n <= 0) {
                System.out.println("Enter a positive integer!");
                n = in.nextInt();
            }
            printArmstrongNumbers(n);
    }
}
