package ReadingUserInputChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // boolean hasNextInt = scanner.hasNextInt();
        // int sum = 0;

        // for (int i = 1; i < 11; i++) {
        // System.out.println("Enter number#" + i);
        // if (hasNextInt) {
        // switch (i) {
        // case 1:
        // int a = scanner.nextInt();
        // sum += a;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 2:
        // int b = scanner.nextInt();
        // sum += b;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 3:
        // int c = scanner.nextInt();
        // sum += c;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 4:
        // int d = scanner.nextInt();
        // sum += d;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 5:
        // int e = scanner.nextInt();
        // sum += e;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 6:
        // int f = scanner.nextInt();
        // sum += f;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 7:
        // int g = scanner.nextInt();
        // sum += g;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 8:
        // int h = scanner.nextInt();
        // sum += h;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 9:
        // int j = scanner.nextInt();
        // sum += j;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // case 10:
        // int k = scanner.nextInt();
        // sum += k;
        // scanner.nextLine(); // handle next line character (enter key)
        // break;
        // }
        // } else {
        // System.out.println("Invalid Number");
        // }
        // }
        // System.out.println(sum);
        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        // while (true) {
        while (counter < 10) {
            int order = counter + 1;

            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextLine();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                // if (counter == 10) {
                // break;
                // }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}