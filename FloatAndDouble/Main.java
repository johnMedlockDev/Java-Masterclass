package FloatAndDouble;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("\nFloat minimum value =" + myMinFloatValue);
        System.out.println("Float maximum value =" + myMaxFloatValue);
        // 32 bits or 4 bytes

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("\nDouble minimum value =" + myMinDoubleValue);
        System.out.println("Double maximum value =" + myMaxDoubleValue);
        // 64 bits or 8 bytes

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // 7 points of precision
        double myDoubleValue = 5d / 3d; // 16 points of precision # faster

        System.out.println("\nMyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // pound to kilograms challenge

        int numPounds = 200;
        double kilogramConversion = 0.45359237d;
        double kilos = numPounds * kilogramConversion;
        System.out.println("\n" + numPounds + " pounds is equal to " + kilos + " kilograms.");
    }
}