package com.company;
//4. Сортировка обменами. Дана последовательность чисел .Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа 1 +ii aиa . Если 1 + ii a a , то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
public class Sort_4 {

    private static int sort_change(int[] arr){
        int changeNumber=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    changeNumber++;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return changeNumber;
    }


   private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[]={5,12,6,123,8,9,0};
        int numberChange=sort_change(array);
        System.out.println("Отсортированный массив: "+numberChange );
        printArray(array);
        System.out.println("Число перестановок: "+numberChange );

    }
}