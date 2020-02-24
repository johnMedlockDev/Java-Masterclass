package KeywordsAndExpressions;

class Main {
    public static void main(String[] args) {

        // 53 keywords
        // true false null
        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344); // expression
        int highScore = 50; // expression

        if (highScore == 50) { // expression
            System.out.println("This is a expression"); // expression
            System.out.println(kilometres);
        }

        // expression challenge
        int score = 100; // expression
        if (score > 99) { // expression within brackets
            System.out.println("You got the high score!"); // expression
            score = 0; // expression
        }

    }
}