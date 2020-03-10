package BankChallenge;

public class Account {

    // instance varibles

    private int accountNumber;
    private double balance;
    private String cName, cEmail, cPhone;

    // constructor

    public Account(int accountNumber, double balance, String cName, String cEmail, String cPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.cName = cName;
        this.cEmail = cEmail;
        this.cPhone = cPhone;
    }

    // getters setters

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCName() {
        return this.cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCEmail() {
        return this.cEmail;
    }

    public void setCEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getCPhone() {
        return this.cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    // instance methods

    public double withdraw(double amount) {
        if (amount > this.balance || amount < 0) {
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;

    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return this.balance;
        }
        return this.balance;
    }
}