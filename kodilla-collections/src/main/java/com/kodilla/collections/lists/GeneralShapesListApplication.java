package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Square square = new Square(10.5);
        shapes.add(square);
        shapes.add(new Circle(10));
        shapes.add(new Triangle(20.4, 15, 9.6));
        Triangle triangle = new Triangle(20.4, 15, 9.6);
        shapes.add(triangle);

        shapes.remove(2);
        shapes.remove(square);
        shapes.remove(triangle);

        System.out.println(shapes.size());

        for (Shape shape : shapes) {
            System.out.println(shape + " area " + shape.getArea() + " perimeter " + shape.getPerimeter());
        }

    }
}