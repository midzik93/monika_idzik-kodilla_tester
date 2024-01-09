package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn() {
        System.out.println("The system is turned on");
    }

    public void turnOff() {
        System.out.println("The system is turned off");
    }

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
