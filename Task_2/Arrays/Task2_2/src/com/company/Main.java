package com.company;

import java.util.Scanner;

public class Main {
// Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        double size = sc.nextDouble();
        //double a = in.nextDouble();
        double array[] = new double[(int) size];
        System.out.println("Enter k geometric constant: ");
        double k = sc.nextDouble();//геометрическая постоянная
        System.out.println("sequence: ");
        for (int m = 0; m < size; m++) {
            array[m]+=m*k;
            System.out.print(array[m]+ "; " ); // Выводим на экран, полученный массив
        }

        System.out.println(" Enter Z: ");
        double z = sc.nextDouble();
        int f=0;
        for (int i = 0; i < size; i++) {
            //array[i]+=i*k;
            if(array[i] >= z){
                f++;
                array[i]=z;}
        }
        System.out.println("Number of replacements: " + f);

        System.out.println(" Array elements after replacement:");
        for (int i = 0; i < size; i++) {
           // array[0]=1;
                System.out.print(" " + array[i]); // Выводим на экран, полученный массив
            }

    }
}
