package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pikman");
        Principal bart = new Principal("Bart", "Simpson");

        List<Integer> jonClasses = Arrays.asList(20, 35, 28, 24, 28);
        List<Integer> jessieClasses = Arrays.asList(20, 35, 30, 25);
        List<Integer> bartClasses = Arrays.asList(25, 19, 39, 20, 35, 28);

        School school1 = new School(jonClasses, "High School A");
        School school2 = new School(jessieClasses, "Hig School B");
        School school3 = new School(bartClasses, "High School C");

        schoolDirectory.put(john, school1);
        schoolDirectory.put(jessie, school2);
        schoolDirectory.put(bart, school3);


        for (Map.Entry<Principal, School> schoolMap : schoolDirectory.entrySet()) {
            System.out.println(schoolMap.getKey().getName() + " the principal of " + schoolMap.getValue().getNameOfSchool() + " has " + schoolMap.getValue().getNumberOfStudents() + " students in the class ");
        }
    }
}



