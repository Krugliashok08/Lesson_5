package org.example;

public class Animal {
    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public void run(int distance) {

        if (distance <= run) {

            System.out.println(name + " смог пробежать " + distance + " метров");

        } else {

            System.out.println(name + " не смог пробежать " + distance + " метров");

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void swim(int distance) {

        if (distance <= swim) {

            System.out.println(name + " смог проплыть " + distance + " метров");

        } else {

            System.out.println(name + " не смог проплыть " + distance + " метров");

        }


    }
}



