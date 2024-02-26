package org.example;

class Cat extends Animal {
    private String name;

    public Cat(String name, int run, int swim, String name1) {
        super(name, run, swim);
        this.name = name1;
    }

  private int run;

    public Cat(String name, int run, int swim, int run1) {
        super(name, run, swim);
        this.run = run1;
    }
    private int swim;

    public Cat(int swim ) {
        super( swim);
        this.swim = swim;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", run=" + run +
                ", swim=" + swim +
                '}';
    }
}