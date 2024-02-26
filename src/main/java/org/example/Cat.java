package org.example;

class Cat extends Animal {
    private String name;

    public Cat(String name, int run, int swim, int appetite, String name1) {
        super(name, run, swim, appetite);
        this.name = name1;
    }

    private int run;

    public Cat(String name, int run, int swim, int appetite, int run1) {
        super(name, run, swim, appetite);
        this.run = run1;
    }

    private int swim;

    public Cat(int swim) {
        this.swim = swim;
    }

    private int appetite;

    public Cat(String name, int run, int swim, int appetite) {
        super(name, run, swim, appetite);
        this.appetite = appetite;
    }

    private boolean satiety;{

    satiety = false;}

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    void feed(Bowl bowl) {
        if (!satiety) {
            satiety = bowl.level(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", swim=" + swim +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}




