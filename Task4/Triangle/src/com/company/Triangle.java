package com.company;

class Triangle {
    private double a;
    private double b;
    private double c;

    private Point pointA = new Point();
    private Point pointB = new Point();
    private Point pointC = new Point();

    Triangle(double sa, double sb, double sc) {
        this.a = sa;
        this.b = sb;
        this.c = sc;
    }

    boolean isExistTriangle() {
        boolean ex = true;
        if ((a + b) < c || (a + c) < b || (b + c) < a)
            ex = false;
        return ex;
    }

    double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double medianA() {
        return 0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a);
    }

    double medianB() {
        return 0.5 * Math.sqrt(2 * a * a + 2 * c * c - c * c);
    }

    double medianC() {
        return 0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
    }

    public static Point createObjectPoint(double x, double y) {
        Point newPoint = new Point(x, y);
        return newPoint;
    }

    public static void getCenter(Point v1, Point v2, Point v3) {
        //d^2 = (х^2— х^1)2+ (y^2— y^1)^2
        double m2 = (v1.getX() + v2.getX() + v3.getX()) / 3.0D;
        double m3 = (v1.getY() + v2.getY() + v3.getY()) / 3.0D;
        m2 = Math.round(m2 * 100.0) / 100.0;
        m3 = Math.round(m3 * 100.0) / 100.0;
        System.out.println("Точка пересечения медиан: [" + m2 + ";" + m3 + "]");
    }

    public static double perimeter(double a, double b, double c) {
        double p = a + b + c;
        p = Math.round(p * 100) / 100d;
        return p;
    }


    public static double calculateSideOfTriangle(Point v2, Point v1) {
        double side = Math.sqrt(Math.pow(v2.getX() - v1.getX(), 2) + Math.pow(v2.getY() - v1.getY(), 2));
        side = Math.round(side * 100) / 100d;
        return side;
    }
}


