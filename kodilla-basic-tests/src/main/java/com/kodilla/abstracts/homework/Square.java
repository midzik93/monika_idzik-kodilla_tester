package com.kodilla.abstracts.homework;

public class Square extends Shape {


    private double a;

    public Square(int a) {
        this.a = a;

    }

    public double getA() {
        return a;
    }


    @Override
    public void surfaceArea() {
        System.out.println("Square area: ");
    }

    @Override
    public void circumference() {
        System.out.println("Circumference of the square: ");
    }
}
