package While;

public class Main {

    public static void main(String[] args) {

        // int count = 1;

        // while (count != 6) {
        // System.out.println("Count value is " + count);
        // count++;
        // }

        // for (count = 1; count != 6; count++) {
        // System.out.println("Count value is " + count);
        // }

        // count = 1;
        // while (true) {
        // if (count == 6) {
        // break;
        // } else {
        // System.out.println("Count value is " + count);
        // count++;
        // }
        // }

        // count = 1;
        // do {
        // System.out.println("Count value was " + count);
        // count++;
        // } while (count != 6);

        // While challenge
        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int numFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (numFound == 5) {
                break;
            }
            sum += number;
            numFound++;
            System.out.println("Even number " + number);
        }
        System.out.println("\nSum = " + sum);
        System.out.println("\nTotal even nums found = " + numFound);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}