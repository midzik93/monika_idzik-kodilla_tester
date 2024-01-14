package com.kodilla.abstracts.homework;

public class ManualTester extends Job {
    public ManualTester(double salary, String responsibilities) {
        super(responsibilities, salary);
    }

    @Override
    public void responsibilitiesOfPerson() {
        System.out.println("Taking care of the quality of the program through manual testing");
    }
}
