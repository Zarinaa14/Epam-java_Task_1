package com.epam.training.zaryna;

import java.util.*;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
public class Main {

    private static double squareOfRightTriangle(double side1, double side2) {
        double square;
        if (side1 > 0 && side2 > 0) {
            square = (side1 * side2) / 2;
        } else {
            square = -1;
        }
        return square;
    }

    private static double calcSquareOfTriangle(double side1, double side2, double side3) {
        double square;

        boolean triangleExist = isTriangleExist(side1, side2, side3);
        if (side1 > 0 && side2 > 0 && side3 > 0 && triangleExist) {
            double p = (side1 + side2 + side3) / 2;
            square = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        } else {
            square = -1;
        }

        return square;
    }

    private static boolean isTriangleExist(double side1, double side2, double side3) {
        boolean triangleExist = (side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2);
        return triangleExist || side1 == side2 && side2 == side3;
    }

    private static double calcSquareOfQuadWithRightAngle(double side1, double side2, double side3, double side4) {
        double square;
        double squareOfPart1 = squareOfRightTriangle(side1, side2);
        double squareOfPart2 = calcSquareOfTriangle(Math.sqrt(side1 * side1 + side2 * side2), side3, side4);

        boolean quadExist = squareOfPart1 > 0 && squareOfPart2 > 0;

        if (side1 > 0 && side2 > 0 && side3 > 0 && side4 > 0 && quadExist) {
            square = squareOfPart1 + squareOfPart2;
        } else {
            square = -1;
        }

        return square;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите две стороны, между которыми прямой угол:");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();

        System.out.println("Введите две оставшиеся стороны:");
        double side3 = in.nextDouble();
        double side4 = in.nextDouble();

        double square = calcSquareOfQuadWithRightAngle(side1, side2, side3, side4);

        if (square > 0) {
            System.out.println("S = " + square);
        } else {
            System.out.println("Не существует четырехугольника с введенными сторонами!");
        }
    }
}