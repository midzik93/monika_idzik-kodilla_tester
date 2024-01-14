package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private static double r;

    public Circle(double r) {
        this.r = r;

    }

    public double getR() {
        return r;
    }

    @Override
    public void surfaceArea() {
        System.out.println("Circle area: ");
    }

    @Override
    public void circumference() {
        System.out.println("Circumference of the circle: ");
    }
}
