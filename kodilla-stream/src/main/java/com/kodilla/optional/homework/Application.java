package com.kodilla.optional.homework;


import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Katarzyna Michalik", new Teacher("Kamil Kwiatkowski")));
        studentsList.add(new Student("Ewelina Michalik", new Teacher("Anna Kamińska")));
        studentsList.add(new Student("Karolina Urbanek", null));
        studentsList.add(new Student("Aleksandra Szczęch", new Teacher("Monika Idzik")));
        studentsList.add(new Student("Kamil Pazdan", null));

        //wyświetlnie par nauczyciel-uczeń
        for (Student student : studentsList) {
            System.out.println("Student: " + student.getName() + ", Teacher: " + getTeacherNameForStudent(student));
        }
    }

        public static String getTeacherNameForStudent (Student student){
            Optional<Teacher> optionalTeacher = student.getTeacher();
            return optionalTeacher.map(Teacher::getName).orElse("<undefined>");
        }

}

