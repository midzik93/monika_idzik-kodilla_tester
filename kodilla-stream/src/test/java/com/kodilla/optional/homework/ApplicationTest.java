package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import com.kodilla.optional.homework.Application;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.optional.homework.Application.getTeacherNameForStudent;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void testDisplayTeacherForStudentWithTeacher() {
        // given
        Student student = new Student("Karolina Lipińska", new Teacher("Mr. Jonson"));

        // when
        String teacherName = getTeacherNameForStudent(student);

        // then
        assertEquals("Mr. Jonson", teacherName);
    }

    @Test
    public void testDisplayUndefinedForStudentWithoutTeacher() {
        // given
        Student student = new Student("Karolina Lipińska", new Teacher(null));

        // when
        String teacherName = getTeacherNameForStudent(student);

        // then
        assertEquals("<undefined>", teacherName);
    }

}