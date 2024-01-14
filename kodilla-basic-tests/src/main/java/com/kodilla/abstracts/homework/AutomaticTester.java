package com.kodilla.abstracts.homework;

public class AutomaticTester extends Job {
    public AutomaticTester(String responsibilities, double salary) {
        super(responsibilities, salary);
    }

    @Override
    public void responsibilitiesOfPerson() {
        System.out.println("Taking care of the quality of the program through automatic testing");

    }
}
