package com.kodilla.abstracts.homework;

import java.awt.geom.Area;

public class Application {
    public static void main(String[] args) {
        //tworzę obiekt square
        Square square = new Square(2);

        //wywołuje metodę surfaceArea() dla obiektu square
        square.surfaceArea();

// wywołuje metodę calculateSquareArea() z klasy Areas
        double squareArea = Areas.calculateSquareArea(2);
        System.out.println(squareArea);


        Triangle triangle = new Triangle(3, 4);
        triangle.surfaceArea();

        double triangleArea = Areas.calculateTriangleArea(3, 4);
        System.out.println(triangleArea);

        Circle circle = new Circle(3);
        circle.circumference();

        double circleCircumference = Circumferences.calculateCircleCircumference(3);
        System.out.println(circleCircumference);
    }
}