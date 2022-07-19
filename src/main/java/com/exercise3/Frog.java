package com.exercise3;

public class Frog extends Animals {

    /**
     * Contructer
     *
     * @param name
     * @param age
     * @param sex
     */
    public Frog(String name, int age, String sex) {
        super(name, age, sex);
    }

    /**
     * Sound of Frog
     */
    private String FrogSound = "Op Op";

    /**
     * method toString Frog
     *
     * @return
     */
    @Override
    public String toString() {
        return "Frog{" +
                "FrogSound='" + FrogSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                "} ";
    }
}
