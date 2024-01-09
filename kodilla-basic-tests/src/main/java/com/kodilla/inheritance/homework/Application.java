package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        IOS ios = new IOS(2023);
        ios.turnOn();
        System.out.println("Year of build: " + ios.getYear());

        Windows windows = new Windows(2000);
        windows.turnOff();
        System.out.println("Year of build: " + windows.getYear());
    }
}
