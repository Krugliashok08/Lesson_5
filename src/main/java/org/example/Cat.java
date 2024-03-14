package org.example;

class Cat extends Animal {

    private boolean satiety;



    public Cat(String name) {

        super(name, 200, 0);

        satiety = false;

    }



    public void eat(int foodAmount) {

        if (foodAmount <= 0) {

            System.out.println("Количество еды достаточно");

        } else if (foodAmount > 10) {

            System.out.println("Количество еды недостаточно");

        } else {

            satiety = true;

            System.out.println("Кот покушал");

        }

    }



    public boolean satiety() {

        return satiety;

    }

}


