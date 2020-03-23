package Composition;

public class Case {
    // instances vars
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    // constructors
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }
}