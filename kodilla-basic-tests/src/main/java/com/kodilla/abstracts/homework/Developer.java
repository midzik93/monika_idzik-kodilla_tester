package com.kodilla.abstracts.homework;

public class Developer extends Job {
    public Developer(String responsibilities, double salary) {
        super(responsibilities, salary);
    }

    @Override
    public void responsibilitiesOfPerson() {
        System.out.println("Writing code");

    }
}
