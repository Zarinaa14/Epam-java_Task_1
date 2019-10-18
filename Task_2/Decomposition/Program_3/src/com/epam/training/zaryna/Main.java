package com.epam.training.zaryna;

import java.util.*;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника

public class Main {

    private static double squareOfRegularTriangle(double a) {
        return (Math.sqrt(3) * a * a) / 4;
    }

    private static double calculateSquareOfRightHexagon(double sideLength) {
        return 6 * squareOfRegularTriangle(sideLength);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side of the regular hexagon: ");
        double sideLength = in.nextDouble();
        if (sideLength > 0) {

            double squareOfHexagon = calculateSquareOfRightHexagon(sideLength);
            System.out.println("The area of a regular hexagon = " + squareOfHexagon);
        } else {
            System.out.println("Side must be greater than zero");
        }
    }
}
