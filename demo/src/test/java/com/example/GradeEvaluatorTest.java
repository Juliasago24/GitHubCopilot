package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeEvaluatorTest {

    @Test
    public void testEvaluatePerformance() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(70);
        assertTrue(evaluator.evaluatePerformance(student));

        student.addGrade(50);
        assertTrue(evaluator.evaluatePerformance(student));

        student.addGrade(30);
        assertFalse(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonors() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(95);
        assertTrue(evaluator.isEligibleForHonors(student));

        student.addGrade(85);
        assertTrue(evaluator.isEligibleForHonors(student));
    }

    @Test
    public void testEvaluatePerformanceNoGrades() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        assertFalse(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformanceOneGrade() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(75);
        assertTrue(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonorsNoGrades() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        assertFalse(evaluator.isEligibleForHonors(student));
    }

    @Test
    public void testIsEligibleForHonorsOneGrade() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(95);
        assertTrue(evaluator.isEligibleForHonors(student));
    }

    @Test
    public void testEvaluatePerformanceBorderline() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(59);
        assertFalse(evaluator.evaluatePerformance(student));

        student.addGrade(60);
        assertFalse(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonorsBorderline() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();

        student.addGrade(89);
        assertFalse(evaluator.isEligibleForHonors(student));

        student.addGrade(90);
        assertFalse(evaluator.isEligibleForHonors(student));
    }
}