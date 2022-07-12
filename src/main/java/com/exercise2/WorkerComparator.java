package com.exercise2;

import java.util.Comparator;

public class WorkerComparator implements Comparator<Worker> {


    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     */
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getWeekSalary().compareTo(o2.getWeekSalary());
    }
}
