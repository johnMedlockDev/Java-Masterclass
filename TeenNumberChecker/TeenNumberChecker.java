package TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 < 20 || num2 >= 13 && num2 < 20 || num3 >= 13 && num3 < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age < 20) {
            return true;
        } else {
            return false;
        }

    }
}