package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4, 5);    //tworzymy obiekt z konstruktora
        car.turnOnLight();      //wywołujemy metode

        Convertible convertible = new Convertible(4, 2);  //
        convertible.closeRoof();
        convertible.turnOnLight();
        System.out.println(convertible.getSeats());

        convertible.displayNumberOfSeats();
    }
}
