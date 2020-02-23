package ByteShortIntLong;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        System.out.println(myValue);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("\nInteger Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("\nByte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("\nShort Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("\nLong Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        short bigShortLiteralValue = 32767;

        System.out.println(bigLongLiteralValue);
        System.out.println(bigShortLiteralValue);

        // bytes occupy 8 bits
        // shorts occupy 16 bits
        // ints occupy 32 bits.
        // longs occupy 64 bits.

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println(myTotal);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);

        byte byteChallenge = 56;
        short shortChallenge = 3000;
        int intChallenge = 40000;
        long longChallenge = 50000L + (10 * (byteChallenge + shortChallenge + intChallenge));

        System.out.println("\n" + longChallenge);

    }
}