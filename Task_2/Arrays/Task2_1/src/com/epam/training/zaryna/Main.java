package com.epam.training.zaryna;
import java.util.Arrays;


/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
   один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
   дополнительный массив.
*/

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] B = new int[]{7, 8, 9,10};
        int K = 3;
        System.out.println(Arrays.toString(shift( A, B,K)));
    }


    private static int[] shift(int A[], int B[], int K) {
        int L = A.length +B.length;
        A = Arrays.copyOf(A, L);
        int m=K;
        for (int j = 0; j < B.length; j++) {
            for (int i = A.length - 1; i > K; i--) {
                A[i] = A[i - 1];
                m=i - 1;
            }
            A[m] = B[ B.length-j-1];

        }

        return A;
    }
}
