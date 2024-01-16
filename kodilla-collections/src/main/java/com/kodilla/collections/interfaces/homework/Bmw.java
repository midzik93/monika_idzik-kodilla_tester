package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {

    private int speed;

    public Bmw(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {

        speed += 30;
    }

    @Override
    public void decreaseSpeed() {

        speed -= 10;
    }
}
