package Inheritance;

public class Animal {
    // instance variables
    private String name;
    private int brain, body, size, weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // getter instance methods
    public String getName() {
        return this.name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    // instance methods
    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called, Animal is moving at " + speed);
    }

}