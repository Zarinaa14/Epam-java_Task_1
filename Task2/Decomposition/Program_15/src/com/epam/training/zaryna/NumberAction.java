package com.epam.training.zaryna;

public class NumberAction {
    public  int size(int number) {
        int size = 0;
        while (number > 0) {
            size++;
            number /= 10;
        }
        return size;
    }

    //возращает массив цифр из числа
    public int[] getSequenceOfDigits(int number, int size) {
        int arr[] = new int[size];
        int curNum;
        int i = 0;
        while (number != 0) {
            curNum = number % 10;
            arr[i] = curNum;
            number /= 10;
            i++;
        }
        return arr;
    }

    public void printNumbersWithIncSequence(int n) {
        int startNum = (int) Math.pow(10, n - 1);
        int endNum = (int) Math.pow(10, n) - 1;

        System.out.println("\n" + n + "-значные числа, цифры которых образуют возрастающую последовательность: ");

        for (int i = startNum; i <= endNum; i++) {
            int[] arr = getSequenceOfDigits(i, n);
            if (checksArrayOfDigits(arr)) {
                System.out.print(i + " ");
            }
        }
    }

    private  boolean checksArrayOfDigits(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                flag = false;
            }
        }
        return flag;
    }
}
