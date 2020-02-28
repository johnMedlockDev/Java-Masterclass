package BarkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (dogBarking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
    }
}

// If the hourOfDay parameter is less than 0 or greater than 23 return false.

// Examples of input/output:

// * shouldWakeUp (true, 1); → should return true

// * shouldWakeUp (false, 2); → should return false since the dog is not
// barking.

// * shouldWakeUp (true, 8); → should return false, since it's not before 8.

// * shouldWakeUp (true, -1); → should return false since the hourOfDay
// parameter needs to be in a range 0-23.

// TIP: Use the if else statement with multiple conditions.

// NOTE: The shouldWakeUp method needs to be defined as public static like we
// have been doing so far in the course.

// NOTE: Do not add a main method to solution code.