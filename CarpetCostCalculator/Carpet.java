package CarpetCostCalculator;

public class Carpet {
    // instance variables
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
            this.cost = cost;
        } else {
            this.cost = cost;
        }
    }

    // Instance Methods
    public double getCost() {
        return this.cost;
    }
}
