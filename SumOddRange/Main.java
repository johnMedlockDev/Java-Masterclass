package SumOddRange;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100)); // prob
        System.out.println(sumOdd(13, 13)); // prob
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
            return sum;
        }
    }

}

// It should call the method isOdd to check if each number is odd.

// The method should use a for loop to sum all odd numbers in that range
// including the end and return the sum.

// -------------------------------------------------------------

// Example input/output:

// * sumOdd(1, 100); → should return 2500

// * sumOdd(-1, 100); → should return -1

// * sumOdd(100, 100); → should return 0

// * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and
// it is odd)

// * sumOdd(100, -100); → should return -1

// * sumOdd(100, 1000); → should return 247500

// TIP: use the remainder operator to check if the number is odd

// NOTE: Both methods needs to be defined as public static like we have been
// doing so far in the course.
// NOTE: Do not add a main method to solution code.