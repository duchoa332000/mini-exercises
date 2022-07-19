package com.exercise3;

public class Tomcat extends Cats {

    /**
     *
     */
    private String sex = "male";

    /**
     * @param name
     * @param age
     * @param sex
     */
    public Tomcat(String name, int age, String sex) {
        super(name, age, sex);
    }

    /**
     * Sound of Tomcat
     */
    private String TomcatSound = "MEOOOO";

    @Override
    public String toString() {
        return "Tomcat{" +
                "TomcatSound='" + TomcatSound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                "} ";
    }
}
