package com.example;

// GradeEvaluator.java

// This class evaluates the student's performance based on their grades.
public class GradeEvaluator {

    // Method to determine if the student has passed or failed based on their average grade.
    public boolean evaluatePerformance(Student student) {
        double average = student.calculateAverage();
        if (student.getGrades().isEmpty()) {
            return false; // Assuming no grades means the student has not passed.
        }
        return average >= 60; // Assuming 60 is the passing grade.
    }

    // Method to check if the student is eligible for honors based on their average grade.
    public boolean isEligibleForHonors(Student student) {
        double average = student.calculateAverage();
        if (student.getGrades().isEmpty()) {
            return false; // Assuming no grades means the student is not eligible for honors.
        }
        return average >= 90; // Assuming 90 is the threshold for honors.
    }
}