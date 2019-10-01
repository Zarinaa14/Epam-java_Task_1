package com.company;

import java.util.Arrays;

//Даны две последовательности m n b  Образовать из них новую последовательность чисел так,
// чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
class Sort_2 {

    private static int[] combineArrays(int[] A, int[] B){
        int L = A.length +B.length;
        A = Arrays.copyOf(A, L);
        int k=A.length-B.length;
                for (int j = 0; j < B.length; j++) {
                    A[k]=B[j];

                  k++;
            }
        return A;
    }
    private static int[] combineArrays2(int[] A, int[] B){
        int L = A.length +B.length;
        A = Arrays.copyOf(A, L);
        int k=A.length-B.length;

            for (int j = 0; j < B.length; j++) {
                for (int i = 0; i < A.length; i++)
                    if(B[j]>A[i]&&B[j]<A[i+1]){
                        for (int f = i; f < A.length; f++) {
                            int count=i+2;
                            int tpm = A[f + count];
                            A[f + count]=A[f + 1];
                            count++;
                        }
                        A[i+1]=B[j];
                    }
            }
        return A;
    }
    private static int[] sort_change(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }



    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int A[]={1,3,5,7,8,10,15,21};
        int B[]={2,3,4,5,11,14,15,22,29};
        //printArray(combineArrays2(A,B)) ;
        printArray(sort_change(combineArrays(A,B)));
    }
}
