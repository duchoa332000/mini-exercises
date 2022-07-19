package com.exercise3;

public class Kitten extends Cats {

    /**
     *
     */
    private String sex = "female";

    /**
     * @param name
     * @param age
     * @param sex
     */
    public Kitten(String name, int age, String sex) {
        super(name, age, sex);
    }

    /**
     * Sound of Kitten
     */
    private String KittenSound = "Mewoooooooooooo";

    /**
     * method toString Kitten
     *
     * @return
     */
    @Override
    public String toString() {
        return "Kitten{" +
                "Kittensound='" + KittenSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                "} ";
    }
}
