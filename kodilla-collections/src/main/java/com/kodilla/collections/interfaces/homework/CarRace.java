package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(200);
        doRace(bmw);
        doRace2(bmw);

        Ford ford = new Ford(180);
        doRace(ford);
        doRace2(ford);

        Opel opel = new Opel(150);
        doRace(opel);
        doRace2(opel);
    }

    private static void doRace(Car car) {
        System.out.println(car.getSpeed());

    }

    public static void doRace2(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Car speed: " + car.getSpeed());
    }
}