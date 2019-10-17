package com.company.com.epam.training;
//Описать класс, представляющий треугольник.
// Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.
import java.util.*;
import static com.company.com.epam.training.Triangle.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1\n");
        double x1 = in.nextDouble();
        System.out.println("Enter y1\n");
        double y1 = in.nextDouble();

        System.out.println("Enter x2\n");
        double x2 = in.nextDouble();
        System.out.println("Enter y2\n");
        double y2 = in.nextDouble();

        System.out.println("Enter x3\n");
        double x3 = in.nextDouble();
        System.out.println("Enter y3\n");
        double y3 = in.nextDouble();
        Point v1 = createObjectPoint(x1, y1);
        Point v2 = createObjectPoint(x2, y2);
        Point v3 = createObjectPoint(x3, y3);

        //Point v1 = new Point(1.0D, 1.0D);
        //Point v2 = new Point(2.0D, 4.0D);
        //Point v3 = new Point(3.0D, 2.0D);
        double v2v1 = calculateSideOfTriangle(v2, v1);
        double v3v2 = calculateSideOfTriangle(v3, v2);
        double v3v1 = calculateSideOfTriangle(v3, v1);



        Triangle triangle = new Triangle(v2v1, v3v2, v3v1);
        if (triangle.isExistTriangle() == true) {
            System.out.println("Стороны треугольника: " + v2v1 + "; " + v3v2 + "; " + v3v1);
            getCenter(v1, v2, v3);
            double perimeter =perimeter(v2v1,v3v2,v3v1);
            System.out.println("Периметр треугольника: " + perimeter);
            double triangleArea = Math.round(triangle.area() * 100) / 100d;
            double triangleMedianA = Math.round(triangle.medianA() * 100) / 100d;
            double triangleMedianB = Math.round(triangle.medianB() * 100) / 100d;
            double triangleMedianC = Math.round(triangle.medianC() * 100) / 100d;
            System.out.println("Площадь треугольника = " + triangleArea);
            System.out.println("Медиана к стороне a = " + triangleMedianA);
            System.out.println("Медиана к стороне b = " + triangleMedianB);
            System.out.println("Медиана к стороне c = " + triangleMedianC);
        } else
            System.out.println("Треугольник с такими сторонами не существует");
    }

}
