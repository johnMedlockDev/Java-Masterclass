package InheritanceChallenge;

public class Car extends Vehicle {
    // instance variables (What do all Cars have?)
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);// calls the super constructor to set name and size
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // Constructor assumes that currentGear is 1
    }

    // instance Setter Methods
    public void changeGear(int currentGear) { // changed semantic definition of method for real worldApp of setter
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction); // calls super class setter to define velocity
    }
}