package com.exercise3;

import java.util.List;

import static com.exercise3.Animals.calculateAnimal;

public class AnimalsManagement {
    public static void main(String[] args) {
        // Create arrays of dog and calculate the average age
        Animals[] listOfAnimal =
                {new Dog("Ki", 6, "male"),
                        new Dog("Lu", 4, "female"),
                        new Dog("Jack", 6, "female"),
                        new Dog("Aton", 3, "male"),
                        new Dog("Muc", 2, "female"),

                };
        for (Animals animals : listOfAnimal) {
            System.out.println(animals.toString());
        }
        calculateAnimal(List.of(listOfAnimal));

        // Create arrays of Kitten and calculate the average age
        Kitten[] listOfKitten =
                {new Kitten("Miu", 3, ""),
                        new Kitten("Joe", 5, ""),
                        new Kitten("Ka", 4, ""),
                        new Kitten("Liu", 2, ""),
                        new Kitten("Gi", 6, ""),
                };
        for (Animals kittens : listOfKitten) {
            System.out.println(kittens.toString());
        }
        calculateAnimal(List.of(listOfKitten));


        // Create arrays of Tomcat and calculate the average age
        Tomcat[] listOfTomcats = {new Tomcat("Fi", 5, ""),
                new Tomcat("Luxi", 7, ""),
                new Tomcat("Ri", 4, ""),
                new Tomcat("Cu", 2, ""),
                new Tomcat("Vus", 3, ""),
        };
        for (Animals tomcats : listOfTomcats) {
            System.out.println(tomcats.toString());
        }
        calculateAnimal(List.of(listOfTomcats));


        // Create arrays of Frog and calculate the average age
        Frog[] listOfFrog = {new Frog("Fui", 5, "male"),
                new Frog("Ech", 3, "female"),
                new Frog("Nhai", 4, "female"),
                new Frog("Noc", 7, "male"),
                new Frog("Uong", 2, "male")
        };
        for (Animals frogs : listOfFrog) {
            System.out.println(frogs.toString());
        }
        calculateAnimal(List.of(listOfFrog));
    }

}
