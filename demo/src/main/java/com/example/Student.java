package com.example;
// Student.java
import java.util.ArrayList;
import java.util.List;

// This class represents a student with attributes such as name, studentID, and grades.
public class Student {
    private String name;
    private String studentID;
    private List<Integer> grades;

    // Constructor to initialize the student's name, studentID, and grades list.
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade to the student's list of grades.
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Method to calculate and return the student's average grade.
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to return the student's letter grade based on their average.
    public String getGradeLetter() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Getters and setters for name and studentID.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}