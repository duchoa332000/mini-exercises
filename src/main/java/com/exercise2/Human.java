package com.exercise2;

/**
 * This is a class for Human
 */
public abstract class Human {

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
     * Get first name
     *
     * @return
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
     * @return
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

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}