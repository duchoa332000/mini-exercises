package com.exercise2;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        // TODO Auto-generated method stub
        if (o1.getFirstName() != null && o2.getFirstName() != null) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return 0;
    }
}
