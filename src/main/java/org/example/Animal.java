package org.example;

public class Animal {
    private String name;
    private int run;
    private int swim;
    Animal(String name, int run, int swim) {
        name = name;
        run = run;
        swim = swim;

    }

    private static int countOfAnimals = 0;
    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", swim=" + swim +
                '}';
    }
}



