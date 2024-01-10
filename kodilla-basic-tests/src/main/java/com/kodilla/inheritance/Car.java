package com.kodilla.inheritance;

//klasa zawiera informację na ten liczby siedzeń oraz kół.
//dodana jest metoda włączania świateł


public class Car {
    private int wheels;
    private int seats;   // zmienne są private więc nie dostaniemy się do nich car.seats

    public void turnOnLight() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public Car(int wheels, int seats) {
        this.seats = seats;
        this.wheels = wheels;
        System.out.println("Car constructor");
    }

    //GETTERY zwracają wartość
    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void displayNumberOfSeats() {
        System.out.println("Number od seats: " + seats);
    }
}
