package DayOfWeek;

public class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(88);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(7);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wenesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}