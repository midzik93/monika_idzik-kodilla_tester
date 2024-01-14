package com.kodilla.abstracts.homework;

public class Circumferences {

    private static final double PI = 3.14;

    public static double calculateTriangleCircumference(double b) {
        return 3 * b;
    }

    public static double calculateSquareCircumference(double a) {
        return 4 * a;
    }

    public static double calculateCircleCircumference(double r) {
        return 2 * PI * r;
    }
}
