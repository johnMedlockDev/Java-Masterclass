package ReadingUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your year of birth:");

        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }

}