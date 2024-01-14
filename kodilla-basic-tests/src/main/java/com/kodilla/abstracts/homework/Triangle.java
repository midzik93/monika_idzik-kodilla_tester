package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;

    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    @Override
    public void surfaceArea() {
        System.out.println("Triangle area: ");
    }

    @Override
    public void circumference() {

        System.out.println("Circumference of the triangle: ");
    }
}
