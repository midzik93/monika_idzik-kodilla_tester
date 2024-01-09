package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("The Windows is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The Windows is turned off");
    }

}
