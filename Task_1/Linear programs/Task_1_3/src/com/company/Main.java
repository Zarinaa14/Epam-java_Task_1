package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/ (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) ∗ 𝑡𝑔 𝑥𝑦
        Scanner in = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter value of x: ");
        x = in.nextDouble();
        //
        System.out.println("Enter value of y: ");
        y = in.nextDouble();
            z = (Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
            System.out.printf("The Result is = %.2f", z);


        //System.out.printf("The Result is = %.2f", z);
        in.close();
    }
}
