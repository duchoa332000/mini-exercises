package com.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class is to manage all humans: student, worker
 */
public class HumanManagement {

    public static void main(String[] args) {
        // init 10 students and add to a student list
        Student student1 = new Student("Hoa", "Nguyen", 10);
        Student student2 = new Student("Hoa2", "Nguyen2", 11);
        Student student3 = new Student("Hang", " Pham", 5);
        Student student4 = new Student("Tuyet", "Pham", 12);
        Student student5 = new Student("Ha", "Tran", 7);
        Student student6 = new Student("Linh", "Ho", 11);
        Student student7 = new Student("Phuc", "Danh", 6);
        Student student8 = new Student("Mai", "Dang", 8);
        Student student9 = new Student("Lan", "Pham", 1);
        Student student10 = new Student("Khang", "Nguyen", 4);
        List<Student> listOfStudent = Arrays.asList(student1, student2, student3, student4, student5,
                student6, student7, student8, student9, student10);
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        listOfStudent.add(student5);
        listOfStudent.add(student6);
        listOfStudent.add(student7);
        listOfStudent.add(student8);
        listOfStudent.add(student9);
        listOfStudent.add(student10);

        List<Human> listOfHuman = new ArrayList<>(listOfStudent.size());
        listOfHuman.addAll(listOfStudent);
//        listhuman.addAll(listworker);

        Collections.sort(listOfStudent, Student.StudentComparatorss);
        for (Student students : listOfStudent) {
            System.out.println(students);
        }

//        Collections.sort(listworker, Worker.compareworker);
//        for (Worker workers : listworker) {
//            System.out.println(workers);
//        }

        System.out.println(
                "----------------------------------------------------------------------------------------------");

//        Collections.sort(listOfHuman, Human.comparehuman);
//        for (Human humans : listhuman) {
//            System.out.println(humans);
//        }

    }

    //
}
