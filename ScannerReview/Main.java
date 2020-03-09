package ScannerReview;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in); // just creates the scanner object
        // // and defines how it will retrieve input
        // System.out.println("Enter your year of birth");

        // boolean hasNextInt = scanner.hasNextInt();
        // if (hasNextInt) {
        // int yearOfBirth = scanner.nextInt();
        // scanner.nextLine();

        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine(); // opens a input capture point and saves to
        // name
        // int age = 2020 - yearOfBirth;

        // if (age >= 0 && age <= 100) {
        // System.out.println("Your name is " + name + ", and your age is " + age);

        // } else {
        // System.out.println("Invalid year of birth");
        // }
        // } else {
        // System.out.println("Unable to parse year of birth.");
        // }

        // scanner.close(); // releases the scanner from memory

        // Scanner scanner = new Scanner(System.in);
        // read ten numbers stop at 10 | add numbers to a sum
        // before each number Enter number #x:
        // use hasNextint() : "Invalid Number"

        // int counter = 1;
        // int sum = 0;

        // while (counter < 11) {
        // System.out.println("Enter number #" + counter + ":");

        // boolean hasNextInt = scanner.hasNextInt();

        // if (hasNextInt) {
        // ++counter;
        // int number = scanner.nextInt();
        // sum += number;

        // } else {
        // scanner.nextLine();

        // System.out.println("Invalid Number");

        // }
        // }
        // System.out.println("sum =" + sum);
        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                } else if (number <= min) {
                    min = number;
                } else if (number >= max) {
                    max = number;
                }
            } else {
                break;
            }

        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        scanner.close();
    }

}