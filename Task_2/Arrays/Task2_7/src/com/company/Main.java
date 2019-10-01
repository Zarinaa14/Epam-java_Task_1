package com.company;
//Даны действительные числа (a_1,a_2...a_n)  . Найти
// max( a_(1+2n,a_2+a_(2n-1),a_n+a_(2n+1))  .
public class Main {
    private static double returnMax(double[] arr){
        double max=arr[0]+arr[arr.length-1];
        double temp;

        for(int i=0;i<arr.length/2;i++) {
            temp=arr[i]+arr[arr.length-1-i];
            if(temp>max) {
                max = temp;
            }
        }

        return max;
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i]+ "; ");
        }
    }
    public static void main(String[] args) {
        double[] array = new double[]{1.0, 0.0, 10.0, 2.0, 6.0, 5.0, 8.0, 17.0};
        if (array.length == 0)
            throw new IllegalArgumentException("array is empty");
        System.out.println("max( a_(1+2n,a_2+a_(2n-1),a_n+a_(2n+1)):  " + returnMax(array));
    }
}
