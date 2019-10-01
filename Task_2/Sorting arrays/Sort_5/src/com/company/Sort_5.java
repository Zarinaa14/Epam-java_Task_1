package com.company;

public class Sort_5 {

    private static int binarySearchOfIndexToInsert(int[]array, int rightIndex,int arrayIndex){
        int leftIndex=0;
        int middleIndex;

        if(arrayIndex<=array[leftIndex]){
            return leftIndex;
        }

        if(arrayIndex>=array[rightIndex]){
            return rightIndex+1;
        }

        while(leftIndex<=rightIndex){

            middleIndex=(leftIndex+rightIndex)/2;

            if(arrayIndex>=array[middleIndex]&&arrayIndex<=array[middleIndex+1]){
                return middleIndex+1;
            }

            if(array[middleIndex]<arrayIndex){
                leftIndex=middleIndex;
            }
            else if(array[middleIndex]>arrayIndex){
                rightIndex=middleIndex;
            }
        }
        return -1;
    }

    private static void insertSort(int[] array) {
        int lastIndexOfSorted=0;

        while(lastIndexOfSorted<array.length && array[lastIndexOfSorted]<array[lastIndexOfSorted+1]){
            lastIndexOfSorted++;
        }

        for(int i=lastIndexOfSorted+1;i<array.length;i++){
            int insertIndex=binarySearchOfIndexToInsert(array,lastIndexOfSorted,array[i]);
            int insertValue=array[i];
            for(int j=i;j>insertIndex;j--){
                array[j]=array[j-1];
            }
            array[insertIndex]=insertValue;
            lastIndexOfSorted++;
        }
    }

    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[]={1,5,2,7};

        insertSort(arr1);
        printArray(arr1);
    }
}