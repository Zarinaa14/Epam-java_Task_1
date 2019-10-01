package com.company;
import java.util.*;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

public class Main {
    private static void generatrArray(int []array){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*51);
        }
    }

    private static int sumAllElements(int[] array, int index){
        int sum=-1;
            sum=array[index-1]+array[index]+array[index+1];
        return sum;
    }

    private static int sumArr(int[] array, int first,  int last){
        //      Находит сумму уммы трех последовательно расположенных элементов
        int sum=0;
        for(int i=first;i<=last-2;i++){
            sum+= sumAllElements(array,i);
        }
        return sum;
    }

    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter size array:");

            int size = in.nextInt();
            if (size > 0) {
                int[] array = new int[size];
                generatrArray(array);
                System.out.println("\nArray :");
                printArray(array);
                System.out.println("\nEnter k:");
                int k = in.nextInt();
                System.out.println("\nEnter m:");
                int m=in.nextInt();
                System.out.println("\nСумма = " + sumArr(array, k, m));

            } else {
                System.out.println("more than zero!");
            }
    }
}