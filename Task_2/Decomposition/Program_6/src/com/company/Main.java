package com.company;
import java.util.*;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Main {

    private static boolean primeNumber(int num1, int num2, int num3){
        return greatestCommonDevision(num1,num2,num3)==1;
    }

    private static int greatestCommonDevision(int a,int b){
        return b == 0 ? a : greatestCommonDevision(b,a % b);
    }

    private static int greatestCommonDevision(int firstNum, int secondNum,int thirdNum) {
        int gcd=greatestCommonDevision(firstNum, secondNum);
        gcd=greatestCommonDevision(gcd,thirdNum);
        return gcd;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter three number: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();

            if (primeNumber(num1, num2, num3)) {
                System.out.println("Prime number: " + num1 + "," + num2 + "," + num3);
            } else {
                System.out.println("This number is not prime" + num1 + "," + num2 + "," + num3);
            }
    }
}
