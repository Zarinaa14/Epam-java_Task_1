package com.epam.training.zaryna;

/**Пусть даны две неубывающие последовательности действительных чисел m n b
Требуется указать те места, на которые нужно вставлять элементы последовательности m  в первую последовательность
так, чтобы новая последовательность оставалась возрастающей.
 **/

public class Sort_7 {

    private static int[] sort_change(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    private static int search(int[] arr1, int currentIndex_arr2) {//первый способ
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] < currentIndex_arr2 && currentIndex_arr2 < arr1[i + 1]) {
                index = i + 1;
            }
        }
        return index;
    }

    private static int[] indexIntoArr1inArr2_1(int[] arr1, int[] arr2) {
        int[] arrOfIndexesToInsert = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arrOfIndexesToInsert[i] = search(arr1, arr2[i]) + i;
        }
        return arrOfIndexesToInsert;
    }

    private static int[] indexIntoArr1inArr2_2(int[] arr1, int[] arr2) {
        int[] arr2OfIndexesToInsert = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2OfIndexesToInsert[i] = binarySearchOfIndex(arr1, arr2[i]) + i;
        }
        return arr2OfIndexesToInsert;
    }

    private static int binarySearchOfIndex(int[] arr1, int currentIndex_arr2) {
        int firstIndex = 0;
        int lastIndex = arr1.length - 1;
        int middleIndex = 0;

        if (currentIndex_arr2 <= arr1[firstIndex]) {
            return firstIndex;
        }
        if (currentIndex_arr2 >= arr1[lastIndex]) {
            return lastIndex + 1;
        }
        while (firstIndex <= lastIndex) {

            middleIndex = (firstIndex + lastIndex) / 2;

            if (currentIndex_arr2 >= arr1[middleIndex] && currentIndex_arr2 <= arr1[middleIndex + 1]) {
                return middleIndex + 1;
            }

            if (arr1[middleIndex] < currentIndex_arr2) {
                firstIndex = middleIndex;
            } else if (arr1[middleIndex] > currentIndex_arr2) {
                lastIndex = middleIndex;
            }
        }
        return -1;
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array1[] = {5, 6, 9, 3, 4, 5, -8, -2};
        int array2[] = {1, 2, 8};

        sort_change(array1);
        sort_change(array2);

        System.out.println("Cгенерированные массивы:");
        printArray(array1);
        printArray(array2);

        System.out.println("\nИндексы куда нужно вставлять элементы второго массива ");
        int result_1[] = indexIntoArr1inArr2_1(array1, array2);
        int result_2[] = indexIntoArr1inArr2_2(array1, array2);
        printArray(result_1);
        printArray(result_2);


    }
}