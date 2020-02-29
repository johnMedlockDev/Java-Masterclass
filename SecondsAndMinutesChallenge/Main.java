package SecondsAndMinutesChallenge;

public class Main {

    public static void main(String[] args) {
        getDurationString(-1, 42);
        getDurationString(45);
        getDurationString(9001);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            int hours = minutes / 60;
            int mins = minutes % 60;
            System.out.println(hours + "h " + mins + "m " + seconds + "s");
            return hours + "h " + mins + "m " + seconds + "s";
        } else {
            System.out.println("Invaild value");
            return "Invaild value";
        }
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            System.out.println("Invaild value");
            return "Invaild value";
        } else if (seconds > 59) {
            int mins = seconds / 60;
            int secs = seconds % 60;
            return getDurationString(mins, secs);
        } else {
            return getDurationString(0, seconds);
        }
    }
}