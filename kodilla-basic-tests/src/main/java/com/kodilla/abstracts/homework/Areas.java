package com.kodilla.abstracts.homework;

public class Areas {

    private static final double PI = 3.14;

    public static double calculateTriangleArea(double h, double b) {
        return (b * h) / 2;
    }

    public static double calculateSquareArea(double a) {
        return a * a;
    }

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }
}
