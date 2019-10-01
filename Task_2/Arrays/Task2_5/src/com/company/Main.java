package com.company;
// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 0, 10, 2, 6, 5, 8};
        if (array.length == 0)
            throw new IllegalArgumentException("array is empty");

      //  for (int i = 1;i <=N ;i++) if (A[1] >= i) cout << A[ i] << endl;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i){
                System.out.print("  " + array[i]);
            }
        }
    }
}
