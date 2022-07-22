package com.exercise3;

import java.util.List;

/**
 * This is a class for Animals
 */
public class Animals {
    public String name;
    public int age;
    public String sex;

    private static final int TOTAL_NUMBER_OF_ANIMAL = 5;

    /**
     * Contructer
     *
     * @param name
     * @param age
     * @param sex
     */
    public Animals(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * Get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get age
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Set age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get sex
     *
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     * Set sex
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Method override toString of Animals
     *
     * @return
     */
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    /**
     * Calculate age of each kind of animal
     */
    static void calculateAnimal(List<Animals> listOfAnimal) {

        double sum = 0;
        double Avg;

        for (Animals animals : listOfAnimal) {
            sum += animals.age;
        }
        Avg = sum / TOTAL_NUMBER_OF_ANIMAL;
        System.out.println("Average: " + Avg);
    }
}
