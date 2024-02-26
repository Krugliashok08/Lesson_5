package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal ("Pushok",200,0);
        Cat cat = new Cat( "Cat",200,0,"Bonya");
        Cat cat2 = new Cat ("Cat", 200, 0, "Pushok");
        Dog dog = new Dog("Dog",500,10, "Chernysh");
        Dog dog2 = new Dog("Dog", 500,10,"Sharik");
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(dog);
        System.out.println(dog2);
        System.out.println("Animals: " + Animal.getCountOfAnimals());
    }
}

