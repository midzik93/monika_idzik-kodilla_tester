package com.kodilla.collections.adv.maps.complex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student john = new Student("John", "Stevenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student bart = new Student("Bart", "Simpson");

        List<Double> jonGradesList = Arrays.asList(5.0, 4.0, 4.5, 5.0, 5.0);
        List<Double> jessieGradesList = Arrays.asList(2.5, 3.0, 2.0);
        List<Double> bartGradesList = Arrays.asList(4.0, 4.0, 4.0, 4.0, 5.0);

        Grades johnGrades = new Grades(jonGradesList);
        Grades jessieGrades = new Grades(jessieGradesList);
        Grades bartGrades = new Grades(bartGradesList);

        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(bart, bartGrades);

        System.out.println(school.get(john));

        for (Map.Entry<Student, Grades> studentEntry : school.entrySet()) {
            System.out.println(studentEntry.getKey().getFirstName() + " avarage " + studentEntry.getValue().getAvarage());
        }
    }
}
