package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;

    public Job(String responsibilities, double salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public abstract void responsibilitiesOfPerson();
}
