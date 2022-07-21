package com.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is to manage all humans: student, worker
 */
public class HumanManagement {

    public static void main(String[] args) {
        // init 10 students and add to a student list
        Student student1 = new Student("Hoa", "Nguyen", 2);
        Student student2 = new Student("Hoang", "Nguyen", 11);
        Student student3 = new Student("Hang", " Pham", 5);
        Student student4 = new Student("Tuyet", "Pham", 12);
        Student student5 = new Student("Ha", "Tran", 7);
        Student student6 = new Student("Linh", "Ho", 11);
        Student student7 = new Student("Phuc", "Danh", 6);
        Student student8 = new Student("Mai", "Dang", 8);
        Student student9 = new Student("Lan", "Pham", 1);
        Student student10 = new Student("Khang", "Nguyen", 4);
//        List<Student> listOfStudent = Arrays.asList(student1, student2, student3, student4, student5,
//                student6, student7, student8, student9, student10);
        List<Student> listOfStudent = new ArrayList<>();
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

        // initialize 10 worker and add to a worker list
        Worker worker1 = new Worker("Hoang", "Pham", 800.0, 8);
        Worker worker2 = new Worker("Hung", "Nguyen", 878.0, 8);
        Worker worker3 = new Worker("Hoa", "Pham", 500.0, 6);
        Worker worker4 = new Worker("Han", "Tran", 900.0, 8);
        Worker worker5 = new Worker("Trong", "Ho", 650.0, 5);
        Worker worker6 = new Worker("Y", "Nguyen", 700.0, 7);
        Worker worker7 = new Worker("Duy", "Le", 750.0, 8);
        Worker worker8 = new Worker("Thien", "Nguyen", 850.0, 8);
        Worker worker9 = new Worker("Nhung", "Pham", 750.0, 7);
        Worker worker10 = new Worker("Phi", "Tran", 900.0, 8);
//        List<Worker> listOfWorker = Arrays.asList(worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10);
        List<Worker> listOfWorker = new ArrayList<>();
        listOfWorker.add(worker1);
        listOfWorker.add(worker2);
        listOfWorker.add(worker3);
        listOfWorker.add(worker4);
        listOfWorker.add(worker5);
        listOfWorker.add(worker6);
        listOfWorker.add(worker7);
        listOfWorker.add(worker8);
        listOfWorker.add(worker9);
        listOfWorker.add(worker10);

        List<Human> listOfHuman = new ArrayList(listOfStudent.size() + listOfWorker.size());
        listOfHuman.addAll(listOfStudent);
        listOfHuman.addAll(listOfWorker);

        listOfStudent.sort(Student.StudentComparators);
        for (Student students : listOfStudent) {
            System.out.println(students);
        }

        listOfWorker.sort(Worker.WorkerComparators);
        for (Worker workers : listOfWorker) {
            System.out.println(workers);
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------");

        listOfHuman.sort(Human.HumanComparators);
        for (Human humans : listOfHuman) {
            System.out.println(humans);
        }

    }

    //
}
