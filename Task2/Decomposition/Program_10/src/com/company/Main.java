package com.company;
import java.util.*;

//Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.


public class Main {

    private static int numberDigits(int num){
        int size=0;
        while(num>0){
            size++;
            num/=10;
        }
        return size;
    }

    private static int getInithDigit(int number, int n) {
        return (int) ((number / Math.pow(10, n - 1)) % 10);
    }

    private static void generateArray(int []array, int num){
        int numOfDigits= numberDigits(num);

        int indexOfDigit;

        for(int i=0;i<array.length;i++){
            indexOfDigit=1+(int)(Math.random()*numOfDigits);
            array[i]= getInithDigit(num,indexOfDigit);
        }
    }

    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите размер массива:");
            int size = in.nextInt();

            while (size <= 0) {
                System.out.println("Некорректный ввод! Введите натуральное число!");
                size = in.nextInt();
            }

            System.out.println("Введите число, цифрами которого будет заполнен массив:");
            int num = in.nextInt();

            while (num < 0) {
                System.out.println("Некорректный ввод! Введите натуральное число!");
                num = in.nextInt();
            }

            int[] array = new int[size];
            generateArray(array, num);
            printArray(array);

    }
}