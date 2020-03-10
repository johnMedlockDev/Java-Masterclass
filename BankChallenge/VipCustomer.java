package BankChallenge;

public class VipCustomer {

    private String name, email;
    private double creditLimit;

    public VipCustomer() {
        this("Joe Blow", "basic@gmail.com", 0.0);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 0.0);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

}
