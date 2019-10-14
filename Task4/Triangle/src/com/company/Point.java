package com.company;

public class Point {

    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected void setPoint(Point p) {
        x = p.x;
        y = p.y;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected void setY(double y) {
        this.y = y;
    }

    protected double getX() {
        return x;
    }

    protected double getY() {
        return y;
    }
}