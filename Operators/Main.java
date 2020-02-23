package Operators;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;

        System.out.println("1 + 2 = " + result);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        // Conditional Statements

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        int secondTopScore = 95;
        int newValue = 50;
        boolean isCar = false;

        // < > <= >= == != #comparison ops
        // && || #and or

        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        if (newValue == 50) {
            System.out.println("This is true");
        }

        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // operator Challenge

        double a = 20.00d;
        double b = 80.00d;
        double c = (a + b) * 100.00d;
        double d = c % 40.00d;
        boolean e;

        if (d == 0.00) {
            e = true;
            System.out.println("e is equal to zero");
        } else {
            e = false;
            System.out.println("Got some remainder " + e);
        }

    }
}