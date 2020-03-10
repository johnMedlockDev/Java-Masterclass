package CarpetCostCalculator;

public class Floor {
    // instance variables
    private double width, length;

    public Floor(double width, double length) {
        if (width < 0 && length < 0) {
            width = 0;
            length = 0;
            this.width = width;
            this.length = length;
        } else if (width < 0) {
            width = 0;
            this.width = width;
            this.length = length;
        } else if (length < 0) {
            length = 0;
            this.width = width;
            this.length = length;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    // instance methods
    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

}
