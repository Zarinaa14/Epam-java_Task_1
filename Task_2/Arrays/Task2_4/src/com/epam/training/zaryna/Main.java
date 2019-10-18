package com.epam.training.zaryna;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Main {
    public static void changeMinMax(double[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("Array is empty!");
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = i;
            if (array[i] < min)
                min = i;

        }

        double tmp = array[max];
        array[max] = array[min];
        array[min] = tmp;

    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
    }

    public static void main(String[] args) {
        double[] array = new double[]{1.0, 2.0, 10.0, 4.0, 6.0};
        printArray(array);
        changeMinMax(array);
        System.out.println("\nМасссив после замены наибольшего и наименьшего элементов: ");
        printArray(array);
    }
}
