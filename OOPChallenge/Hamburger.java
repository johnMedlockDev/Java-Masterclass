package OOPChallenge;

public class Hamburger {

    private String name, meat, breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat
                + ", price is " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
    // // instance vars
    // private String name;
    // private String rollType;
    // private String meatType;
    // private boolean cheese, lettuce, mustard, mayo;
    // private double price;

    // // constructor

    // public Hamburger(String name, String rolltype, String meatType, boolean
    // cheese, boolean lettuce, boolean mustard,
    // boolean mayo) {
    // this.name = name;
    // this.rollType = rolltype;
    // this.meatType = meatType;
    // this.cheese = cheese;
    // this.lettuce = lettuce;
    // this.mustard = mustard;
    // this.mayo = mayo;
    // this.price = 2.50D + checkAdditions();
    // }

    // public Hamburger(String name, String rolltype, String meatType) {
    // this.name = name;
    // this.rollType = rolltype;
    // this.meatType = meatType;
    // this.cheese = false;
    // this.lettuce = false;
    // this.mustard = false;
    // this.mayo = false;
    // this.price = 2.50D + checkAdditions();
    // }

    // // Instance Methods public
    // public String getName() {
    // return name;
    // }

    // public double getPrice() {
    // return price;
    // }

    // public String getRollType() {
    // return rollType;
    // }

    // public String getMeatType() {
    // return meatType;
    // }

    // public boolean hasCheese() {
    // return cheese;
    // }

    // public boolean hasMustard() {
    // return mustard;
    // }

    // public boolean hasMayo() {
    // return mayo;
    // }

    // public boolean hasLettuce() {
    // return lettuce;
    // }

    // private double checkAdditions() {

    // if (cheese) {
    // this.price += .50D;
    // }

    // if (lettuce) {
    // this.price += .50D;
    // }

    // if (mustard) {
    // this.price += .25D;
    // }

    // if (mayo) {
    // this.price += .25D;
    // }

    // return this.price;
    // }

}
