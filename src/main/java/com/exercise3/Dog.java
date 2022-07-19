package com.exercise3;

public class Dog extends Animals {

    /**
     * Contructer
     *
     * @param name
     * @param age
     * @param sex
     */
    public Dog(String name, int age, String sex) {
        super(name, age, sex);
    }

    /**
     * Sound of Dog
     */
    private String Dogsound = "Gau gau";

    @Override
    public String toString() {
        return "Dog{" +
                "Dogsound='" + Dogsound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                "} ";
    }
}
