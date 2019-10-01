package com.company;
//6. Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Prime_number {

        public static double sumOfPrimeIndexs(double arr[]) {
            double tpm=0;

            for (int i=0;i<arr.length;i++) {
                if(Prime(i)) {
                    tpm += arr[i];
                }
            }

            return tpm;
        }

        public static boolean Prime( int number) {
            boolean prime;

            if(number<=1) {
                prime = false;
            }
            else {
                prime = true;
                int i = 2;
                while (i*i<=number) {
                    if (number % i != 0) {
                        i++;
                    } else {
                        prime = false;
                        break;
                    }
                }
            }
            return prime;
        }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i]+ "; ");
        }
    }

    public static void main(String[] args) {
        double[] array = new double[]{1.0, 0.0, 10.0, 2.0, 6.0, 5.0, 8.0, 17.0};
        if (array.length == 0)
            throw new IllegalArgumentException("array is empty");

        System.out.println("The sum of numbers whose index is a Prime number = " + sumOfPrimeIndexs(array));
        System.out.println("Searched for in the array:");
        printArray(array);

    }
}
