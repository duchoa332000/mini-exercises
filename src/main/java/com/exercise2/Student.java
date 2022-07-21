package com.exercise2;

import java.util.Comparator;

/**
 * This is a Student class which is derived from Human
 */
public class Student extends Human {
    public static Comparator<Student> StudentComparators = new StudentComparator();
    private Integer grade;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     * @param grade
     */
    public Student(String firstName, String lastName, Integer grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    /**
     * Get grade
     *
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * Set grade
     *
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * Method override toString of Student
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "grade='" + grade + '\'' +
                "} " + super.toString();
    }
}
