package OOPChallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        Healthy healthy = new Healthy("Bacon", 5.67);
        healthy.addHamburgerAddition1("Egg", 5.43);
        healthy.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total healthy burger price " + healthy.itemizeHamburger());

        Deluxe db = new Deluxe();
        db.addHamburgerAddition3("Should not do this", 100.51);
        db.itemizeHamburger();
    }
}
// bills burgers wants a better selling process for hamburgers
// Help bill select the types fo burgers with special additions to each burger
// and pricing
// create a base hamburger // and two other burgers
// base should have the folling items roll type, meat, and up to 4 additions
// like (letture tomato, carrat)
// attach additional cost to each of the additions
// calulate the final cost of the burger with additions
//
// Create a Hamburger class
// the constructor should have roll type , meat , price, name
// create two subclasses Healthy burger and deluxe hamburger

// healthy will have brown rye bread roll // up to 6 additions // plus two
// additions at factored in to base cost

// Deluxe hamburger comes with chips and drinks as additions no additions
// allowed.
// use setters to prevent additional additions
