package com.exercise2;

import java.util.Comparator;

/**
 * This is a class for Human
 */
public abstract class Human {
    public static Comparator<Human> HumanComparators = new HumanComparator();
    private String firstName;
    private String lastName;

    /**
     * Constructor
     *
     * @param firstName
     * @param lastName
     */
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get fist name
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method override toString of Human
     *
     * @return
     */
    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

//    public int compareTo(Human o) {
//        return o.getFirstName().compareTo(o.getFirstName());
//    }

}