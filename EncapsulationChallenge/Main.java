package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {
        Printer printerNonDuplex = new Printer(false);

        printerNonDuplex.getNumPagesPrinted();
        printerNonDuplex.printPages(20);
        Printer printerDuplex = new Printer(true);
        System.out.println("--------------------------------------------");
        printerDuplex.printPages(25);
        printerDuplex.printPages(30);
        printerDuplex.getNumPagesPrinted();
    }
}