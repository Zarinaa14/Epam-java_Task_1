package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/ (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) ∗ 𝑡𝑔 𝑥𝑦
        Scanner in = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter value of x [-1,1]: ");
        x = in.nextDouble();
        //
        System.out.println("Enter value of y [-1,1]: ");
        y = in.nextDouble();
        //
        if (x >= -1 && 1 >= x && y >= -1 && 1 >= y ) {
            z = (Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
            System.out.printf("The Result is = %.2f", z);
        } else  System.out.println("Введите х в промежутке[-1,1]");

        //System.out.printf("The Result is = %.2f", z);
        in.close();
    }
}
