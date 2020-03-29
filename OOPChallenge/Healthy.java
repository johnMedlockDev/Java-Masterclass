package OOPChallenge;

public class Healthy extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public Healthy(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}
// public class Healthy extends Hamburger {
// // // instances vars
// // private boolean salad;
// // private boolean chips;
// // private double price;

// // Healthy(String name, String meatType, boolean salad, boolean chips) {
// // super(name, "brown rye bread roll", meatType);
// // this.salad = salad;
// // this.chips = chips;
// // this.price = 4.50;
// // }
// }

// healthy will have brown rye bread roll // up to 6 additions // plus two
// additions at factored in to base cost

// Deluxe hamburger comes with chips and drinks as additions no additions
// allowed.
// use setters to prevent additional additions

// ---------

// bills burgers wants a better selling process for hamburgers
// Help bill select the types fo burgers with special additions to each burger
// and pricing
// create a base hamburger // and two other burgers

// base should have the folling items roll type, meat, and up to 4 additions
// like (letture, tomato, carrat)
// attach additional cost to each of the additions
// calulate the final cost of the burger with additions
//
// Create a Hamburger class
// the constructor should have roll type , meat , price, name
// create two subclasses Healthy burger and deluxe hamburger