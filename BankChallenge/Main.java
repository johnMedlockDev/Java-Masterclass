package BankChallenge;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(500, 1000.00, "John Medlock", "john@gmail.com", "501-888-8888");
        System.out.println(account.deposit(2010));
        System.out.println(account.withdraw(10));
        System.out.println(account.getBalance());
        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Rick James", "rick@gmail.com");
        VipCustomer vip3 = new VipCustomer("Lucy Lu", "Lucy@gmail.com", 1000.00);

        System.out.println(vip1.getName());
        System.out.println(vip1.getEmail());
        System.out.println(vip1.getCreditLimit());

        System.out.println(vip2.getName());
        System.out.println(vip2.getEmail());
        System.out.println(vip2.getCreditLimit());

        System.out.println(vip3.getName());
        System.out.println(vip3.getEmail());
        System.out.println(vip3.getCreditLimit());

    }
}