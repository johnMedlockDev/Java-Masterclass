package EncapsulationChallenge;

public class Printer {
    // instance vars
    private double tonerLevel;
    private int numPagesPrinted;
    private boolean duplex;

    // constructor
    public Printer(boolean duplex) {
        this.tonerLevel = 100.00D;
        this.numPagesPrinted = 0;
        this.duplex = duplex;
    }

    // instance methods
    public void fillToner() {
        this.tonerLevel = (100D - this.tonerLevel) + this.tonerLevel;
        System.out.println("Toner is " + this.tonerLevel + "%");
    }

    public void printPages(int numPages) {
        if (numPages < 0) {
            System.out.println("numPages must be positive");
        } else {
            if (duplex) {
                this.numPagesPrinted += numPages * 2;
                System.out.println("Total printed pages = " + this.numPagesPrinted);
            } else {
                this.numPagesPrinted += numPages;
                System.out.println("Total printed pages = " + this.numPagesPrinted);
            }
            if (this.numPagesPrinted >= 100) {
                fillToner();
                this.numPagesPrinted = 0;
            }
        }

        // will print pages
        // add logic to print multipule pages if duplex
    }

    public void getTonerLevel() {
        System.out.println("Current Toner level: " + this.tonerLevel + "%");
    }

    public void getNumPagesPrinted() {
        System.out.println("Total Number of Pages Printed = " + this.numPagesPrinted);
    }

}