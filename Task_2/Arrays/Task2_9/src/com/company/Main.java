package com.company;

import java.util.Scanner;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Main {

    private static int[] sort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
     }
        return arr;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }
    public static int findMinOfgroup(int[] arr){
        int lenofgroup=1;
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-lenofgroup]){
                lenofgroup++;
            }
        }
        for(int i=lenofgroup-1;i<arr.length;i++){
            if(arr[i]==arr[i-lenofgroup+1]) {
                result = arr[i];
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //int[] array = new int[]{5,6,3,4,3,5,6,6};
        array =sort(array);
        printArray(array);
        System.out.print("N: "+findMinOfgroup(array));
    }
}
