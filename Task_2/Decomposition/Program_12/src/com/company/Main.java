package com.company;

import java.util.*;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
public class Main {

    //сумма цифр, которых =k и которых < n
    private static int[] getNumbersWithSumOfDigits(int k,int n){
        int[] arrOfNum=new int[n];
        int index=0;

        while(n-->0){
            if(sum(n)==k){
                arrOfNum[index]=n;
                index++;
            }
        }

        int[]resultArray=new int[index];

        for(int i=0;i<resultArray.length;i++){
            resultArray[i]=arrOfNum[i];
        }

        return resultArray;
    }

    private static int sum(int num){
        int sum=0;

        while(num>0){
            sum+=num%10;
            num/=10;
        }

        return sum;
    }


    public static void generateArray(int[] array, int num1,int num2){
        int[] arrOfNums=getNumbersWithSumOfDigits(num1,num2);
        int randomIndex;
        if(arrOfNums.length>0) {
            for (int i = 0; i < array.length; i++) {
                randomIndex = (int) (Math.random() * arrOfNums.length);
                array[i] = arrOfNums[randomIndex];
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter size array:");
            int size = in.nextInt();
            while (size <= 0) {
                System.out.println("Enter more than zero");
                size = in.nextInt();
            }

            System.out.println("Enter K:");
            int k = in.nextInt();
            while (k <= 0) {
                System.out.println("Enter more than zero!");
                k = in.nextInt();
            }

            int m = in.nextInt();
            while (m <= 0) {
                System.out.println("Enter more than zero");
                m = in.nextInt();
            }

            int[] array = new int[size];
            generateArray(array, k, m);
            printArray(array);

    }
}
