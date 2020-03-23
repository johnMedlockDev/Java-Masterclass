package Composition;

public class Dimensions {
    // instance vars
    private int width;
    private int height;
    private int depth;

    // constructors
    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // instance methods
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getDepth() {
        return this.depth;
    }
}