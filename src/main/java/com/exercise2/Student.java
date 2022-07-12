package com.exercise2;

import java.util.Comparator;

/**
 * This is a Student class which is derived from Human
 */
public class Student extends Human {
    public static Comparator<Student> StudentComparators = new StudentComparator();
    private String grade;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param grade
     */
    public Student(String firstName, String lastName, String grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    /**
     * Get grade
     *
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Set grade
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                '}';
    }
}
