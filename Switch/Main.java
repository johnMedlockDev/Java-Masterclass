package Switch;

public class Main {

    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Value a 4, 5, or 6");
                break;
            default:
                System.out.println("Was not 1, 2, or 3");
                break;
        }
        // Switch challenge
        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Char not found");
                break;
        }
    }

}