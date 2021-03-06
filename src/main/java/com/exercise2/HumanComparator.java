package com.exercise2;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     */
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
