package com.kodilla.collections.adv.maps.homework;

import java.util.*;

public class School {

    private String nameOfSchool;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(List<Integer> studentsInClasses, String nameOfSchool) {
        this.studentsInClasses = studentsInClasses;
        this.nameOfSchool = nameOfSchool;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", studentsInClasses=" + studentsInClasses +
                '}';
    }

    public int getNumberOfStudents() {
        int sum = 0;
        for (int students : studentsInClasses) {
            sum += students;
        }
        return sum;
    }
}