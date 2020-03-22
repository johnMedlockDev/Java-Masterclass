package PoolArea;

public class Rectangle {
    // instance variables
    private double width, length;

    // constructors
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // instance methods
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return (this.width * this.length);
    }
}

// ----------------------------------------------------------------------
// NOTE: All methods should be defined as public NOT public static.

// NOTE: In total, you have to write 2 classes.

// NOTE: Do not add a main method to the solution code.

// The Swimming Company has asked you to write an application that calculates
// the volume of cuboid shaped pools.

// 1. Write a class with the name Rectangle. The class needs two fields
// (instance variable) with name width and length both of type double.

// The class needs to have one constructor with parameters width and length both
// of type double and it needs to initialize the fields.

// In case the width parameter is less than 0 it needs to set the width field
// value to 0.

// In case the length parameter is less than 0 it needs to set the length field
// value to 0.

// Write the following methods (instance methods):
// * Method named getWidth without any parameters, it needs to return the value
// of width field.

// * Method named getLength without any parameters, it needs to return the value
// of length field.

// * Method named getArea without any parameters, it needs to return the
// calculated area (width * length).