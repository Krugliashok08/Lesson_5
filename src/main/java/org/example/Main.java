package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Bonya");
        Cat cat2 = new Cat ("Pushok");
        Dog dog1 = new Dog("Chernysh");
        Dog dog2 = new Dog("Sharik");
        Animal[] animals = {cat1,cat2,dog1,dog2};
        Bowl bowl = new Bowl (20);

        for (Animal animal : animals) {

            animal.run(300);

            animal.swim(3);

        }



        cat1.eat(9);

        cat2.eat(20);



        bowl.addFood(5);



        for (Animal animal : animals) {

            if (animal instanceof Cat) {

                Cat cat = (Cat) animal;

                System.out.println(cat.getName() + " сытость: " + cat.satiety());

            }

        }
    }
    }


