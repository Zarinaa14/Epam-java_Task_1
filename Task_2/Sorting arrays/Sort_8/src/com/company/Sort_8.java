package com.company;
import java.util.*;

/*
   8.Даны дроби. Составить программу, которая приводит эти дроби к общему знаменателю
    и упорядочивает их в порядке возрастания.
 */

public class Sort_8 {
    

    private static void printFraction(int[] arraysNumeretor, int[] arraysDenominator){
        for(int i=0;i<arraysNumeretor.length;i++){
            System.out.print(arraysNumeretor[i]+"|"+arraysDenominator[i]+" ");
        }
    }

    private static void commonDenominator(int[] arrayNumeretor, int[] arrayDenominator){
        int commonDenominator=leastCommonMultiply(arrayDenominator);
        for(int i=0;i<arrayNumeretor.length;i++){
            arrayNumeretor[i]*=commonDenominator/arrayDenominator[i];
            arrayDenominator[i]=commonDenominator;
        }
        changeSort(arrayNumeretor);
    }

    private static void changeSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    changeArrayElements(array,j,j+1);
                }
            }
        }
    }

    private static void changeArrayElements(int[]array,  int index_1, int index_2){
        int tpm=array[index_1];
        array[index_1]=array[index_2];
        array[index_2]=tpm;
    }

    private static int leastCommonMultiply(int[]array){
        int nok=array[0];
        for(int i=1;i<array.length;i++){
            nok=(nok*array[i])/ greatestCommonMultiple(nok,array[i]);
        }
        return nok;
    }

    private static int greatestCommonMultiple(int nok, int secondNum) {
        if(secondNum==0) {
            return Math.abs(nok);
        }
        else {
            return greatestCommonMultiple(secondNum,nok%secondNum);
        }
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Количество дробей:");
            int sizeArrOfFractions = in.nextInt();

            if(sizeArrOfFractions>0) {

                int arrayNumeretor[] = new int[ sizeArrOfFractions];
                System.out.println("Введите числители дробей:");
                for (int i = 0; i <  sizeArrOfFractions; i++) {
                    arrayNumeretor[i] = in.nextInt();
                }
                int arrayDenominator[] = new int[ sizeArrOfFractions];
                System.out.println("Введите знаменатели дробей:");
                for (int i = 0; i <  sizeArrOfFractions; i++) {
                    arrayDenominator[i] = in.nextInt();
                }

                System.out.println( "Полученные дроби: ");
                printFraction(arrayNumeretor, arrayDenominator);

                commonDenominator(arrayNumeretor, arrayDenominator);
                System.out.println("\n\nДроби приведены к общему знаменателю и отсортированы:");
                printFraction(arrayNumeretor, arrayDenominator);

            } else{
                System.out.println("Число дробей должно быть положительным!");
            }

    }
}