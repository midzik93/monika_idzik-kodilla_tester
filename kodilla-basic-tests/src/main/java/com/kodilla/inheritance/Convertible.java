package com.kodilla.inheritance;

//klasa posiada możliwość otwierania i zamykania dachu
public class Convertible extends Car {
    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

    public Convertible(int wheels, int seats) {
        super(wheels, seats);    // super();  <-zawsze najpierw będzie wywołany konstruktor z nadklasy nie przyjmującej żadnego argumentu czyli z Car
        // super może być ale nie musi
        System.out.println("Convertible constructor");
    }

}
