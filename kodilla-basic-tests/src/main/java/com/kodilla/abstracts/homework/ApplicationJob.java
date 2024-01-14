package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {
        ManualTester manualTester = new ManualTester(5000, "Taking care of the quality of the program through manual testing");


        Person person = new Person("Anna", 35, "Manual Tester");

        System.out.println("Responsibilities of " + person.getFirstName() + " on the position " + person.getJob() + " is " + manualTester.getResponsibilities());

    }
}
