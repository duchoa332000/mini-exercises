package com.exercise2;

import java.util.Arrays;
import java.util.List;

/**
 * This class is to manage all humans: student, worker
 */
public class HumanManagement {
    
    public static void main(String[] args) {
        // init 10 students and add to a student list
        Student student1 = new Student("Hoa", "Nguyen", "10");
        Student student2 = new Student("Hoa2", "Nguyen2", "11");
        List<Student> listOfStudent = Arrays.asList(student1, student2);

        //
    }

}
