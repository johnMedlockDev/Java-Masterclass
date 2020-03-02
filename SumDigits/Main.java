package SumDigits;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(74542135));
        // System.out.println(sumDigits(464));
        // System.out.println(sumDigits(8));
    }

    public static int sumDigits(int number) {

        // if (number >= 10 && number > 0) {
        // int sum = 0;
        // while (number >0)
        // } else {
        // return -1;
        // }
        // }

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {

            // extract the lest-significant digit
            int digit = number % 10;
            System.out.println("digit = " + digit);
            sum += digit;
            System.out.println("sum = " + sum);

            // drop the least-significant digit
            number /= 10;
            System.out.println("number = " + number);
            System.out.println("");
        }
        return sum;
    }
}