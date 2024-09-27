package com.example;

import org.junit.jupiter.api.Test;

import com.example.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAddGrade() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(85);
        assertEquals(1, student.getGrades().size());
        assertEquals(85, student.getGrades().get(0));
    }

    @Test
    public void testCalculateAverage() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(80);
        student.addGrade(90);
        assertEquals(85.0, student.calculateAverage());
    }

    @Test
    public void testGetGradeLetter() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(95);
        student.addGrade(85);
        assertEquals("A", student.getGradeLetter());

        student.addGrade(75);
        assertEquals("B", student.getGradeLetter());

        student.addGrade(65);
        assertEquals("C", student.getGradeLetter());

        student.addGrade(55);
        assertEquals("D", student.getGradeLetter());

        student.addGrade(45);
        assertEquals("F", student.getGradeLetter());
    }
}