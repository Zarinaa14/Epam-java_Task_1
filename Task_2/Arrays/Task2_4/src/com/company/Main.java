package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[]{1.0, 2.0, 10.0, 4.0, 6.0};
        if (array.length == 0)
            throw new IllegalArgumentException("array is empty");
        int min = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++)
        {
            min = array[i] < array[min] ? i : min;
            max = array[i] > array[max] ? i : max;
        }
        double tmp = array[max];
        array[max] = array[min];
        array[min] = tmp;




        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
    }
}
