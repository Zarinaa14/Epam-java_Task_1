package com.company;
//Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        double size = sc.nextDouble();
        double array[] = new double[(int) size];
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextDouble();
            if(array[i]>0) {
                a++;
            }
            if(array[i]==0) {
                b++;
            }
            if(array[i]<0) {
                c++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]+"; ");
        }
        System.out.println("Positive number: " + a);
        System.out.println("Zero numbers: " + b);
        System.out.println("Negative number: " + c);
    }
}
