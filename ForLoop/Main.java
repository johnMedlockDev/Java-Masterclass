package ForLoop;

public class Main {

    public static void main(String[] args) {
        // System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,
        // 2.0));
        // // for(init; termination; increment){}
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Loop " + i + " hello!");
        // }
        // // For challenge
        // for (int i = 2; i <= 8; i++) {
        // System.out.println("10,000 at " + i + "% = " + calculateInterest(10000.0D,
        // i));
        // }
        // // For challenge p2 backwards
        // for (int i = 8; i >= 2; i--) {
        // System.out.println("10,000 at " + i + "% = " + String.format("%.2f",
        // calculateInterest(10000.0D, i)));
        // }
        int primeCount = 0;

        for (int i = 0; i < 25; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
                primeCount++;
                if (primeCount == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}