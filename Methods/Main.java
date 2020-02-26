package Methods;

public class Main {

    public static void main(String[] args) {

        caculateScore(true, 800, 5, 100);
        caculateScore(true, 10000, 8, 200);

    }

    public static void caculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}