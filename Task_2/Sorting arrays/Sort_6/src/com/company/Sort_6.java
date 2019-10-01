package com.company;
// 6. Сортировка Шелла. Дан массив n действительных чисел.
// Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента 1 +i_i aи a . Если 1 + ii a a ,
// то продвигаются на один элемент вперед. Если 1 + ii a a , то производится перестановка и сдвигаются
// на один элемент назад. Составить алгоритм этой сортировки.

public class Sort_6 {

    private static void sortShell(int[] array){
        int i=0;
        while(i<array.length-1){
            if(array[i]>array[i+1]){
                swap(array,i,i+1);
                if(i>0) {
                    i--;
                }
            }else{
                i++;
            }
        }
    }

    private static void swap(int[]array, int index1, int index2){
        int tpm=array[index1];
        array[index1]=array[index2];
        array[index2]=tpm;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,6,9,3,4,5,-8,-2};

        sortShell(arr);

        printArray(arr);
    }
}