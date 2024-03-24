package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

//for each "dla każdego elementu kolekcji wykonaj kod zawarty w ciele pętli".
        for (Square square : shapes) {  // for (Typ zmienna : kolekcja) {
            //Iteruj po kolekcji kolekcja shapes i kolejne jej elementy wstawiaj do zmiennej o nazwie square która jest typu Square.
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
    }
}