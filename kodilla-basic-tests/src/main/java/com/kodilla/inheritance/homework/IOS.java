package com.kodilla.inheritance.homework;

public class IOS extends OperatingSystem {

    public IOS(int year) {
        super(year);

    }

    @Override
    public void turnOn() {
        System.out.println("The iOS is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The iOS is turned off");
    }
}
