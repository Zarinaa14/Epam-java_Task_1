package com.company;
import java.util.*;
import java.lang.*;
//. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

class Main {
    private static int size(int number ){
        int size=0;
        while(number>0){
            size++;
            number/=10;
        }
        return size;
    }
    //возращает массив цифр из числа
    private static int[] isIncSequenceOfDigits(int number, int size ){
        int arr[]=new int[size];
        int curNum;
        int i=0;
        while(number != 0) {
            curNum = number % 10;
            //  System.out.print(curNum); System.out.print("; ");
            arr[i]=curNum;
            number /= 10;
            i++;
        }
        return arr;
    }
    public static void printNumbersWithIncSequence(int n){
        int startNum=(int)Math.pow(10,n-1);
        int endNum=(int)Math.pow(10,n)-1;



        System.out.println("\n"+n+"-значные числа, цифры которых образуют возрастающую последовательность: ");

        for(int i=startNum;i<=endNum;i++){
            int[] arr=isIncSequenceOfDigits(i,size(i));
            if(checksArrayOfDigits(arr)){
                System.out.print(i+" ");
              }
            }
        }




    private static boolean checksArrayOfDigits(int[] arr){
        boolean flag= false;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=true;
            }
            else{ flag=false;}
        }

        return flag;
    }


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите некоторое натуральное число:");
        int k = input.nextInt();
        if(k >0) {
           // int size = size(k);
           //  System.out.println("Size :" + size);
          // int[] result = isIncSequenceOfDigits(k, size);
           //checksArrayOfDigits(result);
            printNumbersWithIncSequence(k);
        }
        else   System.out.println("Enter more than zero!");
    }
}