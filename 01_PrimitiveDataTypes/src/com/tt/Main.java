package com.tt;

public class Main {

    public static void main(String[] args) {

        //******************************************************************************
        //*************************** INTEGER BYTE AND SHORT ***************************
        // Int 32 bits (4 bytes)
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValueWithJava8 = -2_147_483_648;   // More readable way. It is same with -2147483648

        System.out.println("Min Value : " + myMinValue);
        System.out.println("Max Value : " + myMaxValue);
        System.out.println("Min Value : " + myMinValueWithJava8);

        // Byte 8 bits (1 byte)
        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;

        System.out.println("Min Byte Value : " + myByteMinValue);
        System.out.println("Max Byte Value : " + myByteMaxValue);

        // Short 16 bits (2 bytes)
        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;

        System.out.println("Min Short Value : " + myShortMinValue);
        System.out.println("Max Short Value : " + myShortMaxValue);

        // Long 64 bits (8 bytes)
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Min Long Value : " + myMinLongValue);
        System.out.println("Max Long Value : " + myMaxLongValue);


        // Arithmetic Operations :
        int myTotal = myMinValue / 2;
        byte myNewByteValue = (byte) (myByteMinValue / 2);  // Casting to byte
        short myNewShortValue = (short) (myByteMaxValue / 2); // Casting to short

        System.out.println("Total Int   : " + myTotal);
        System.out.println("Total Byte  : " + myNewByteValue);
        System.out.println("Total Short : " + myNewShortValue);

        // Assignment
        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid int number.
        // 4. Create a long variable and set it to any valid long number.
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longValue = 50000L;

        long operation = longValue + (long) (10 * (byteValue + shortValue + intValue));
        System.out.println("Operation Result : " + operation);
        //******************************************************************************


        //******************************************************************************
        //***************************     FLOAT AND DOUBLE   ***************************
        // with of float = 32 bits (4 bytes)
        float myFloatValue = 5f / 2f;
        // with of double = 64 bits (8 bytes)
        double myDoubleValue = 5d / 2d;

        float myFloatValue2 = 5.4f;
        double myDoubleValue2 = 5.2;

        System.out.println("My Double Value   :" + myDoubleValue);
        System.out.println("My Float  Value   :" + myFloatValue);
        System.out.println("My Double Value 2 :" + myDoubleValue2);
        System.out.println("My Float  Value 2 :" + myFloatValue2);

        // Assignment
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print the results.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double poundValue = 200d;
        double kgValue = poundValue * 0.45359237d;

        System.out.println("Pound : " + poundValue + " - Kilogram : " + kgValue);

        double pi = 3.141592d;
        System.out.println("Pi : " + pi);
        //******************************************************************************


        //******************************************************************************
        //***************************     BOOLEAN AND CHAR   ***************************
        // 16 bits (2 bytes)
        char myChar = 'D';
        char myCharWithUnicode = '\u00A9';

        boolean myBool = true;

        System.out.println("Char Value : " + myChar);
        System.out.println("Unicode Value : " + myCharWithUnicode);
        System.out.println("Bool Value : " + myBool);
        //******************************************************************************


        //******************************************************************************
        //***************************         STRINGS        ***************************
        // Actually string is not a primitive type! But it is comes with them.
        String myString = "This is a string";
        System.out.println("String : " + myString);
        myString = myString + ", and this is more.";
        System.out.println("String : " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("String : " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Result : " + numberString);

        String lastString = "10";
        int myLastInt = 50;
        lastString = lastString + myLastInt;
        System.out.println("Result : " + lastString);   // It converts int to string and add strings. It will show 1050.

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("Result : " + lastString);   // It converts int to string and add strings. It will show 1050.
        //******************************************************************************

        //******************************************************************************
        //***************************        OPERATORS       ***************************
        int opResult = 1 + 2;           // Plus
        System.out.println("Result : " + opResult);
        opResult = opResult - 1;        // Minus
        System.out.println("Result : " + opResult);
        opResult = opResult * 10;       // Multiply
        System.out.println("Result : " + opResult);
        opResult = opResult / 5;        // Divide
        System.out.println("Result : " + opResult);
        opResult = opResult % 3;        // Remainder
        System.out.println("Result : " + opResult);
        opResult++;                     // Incrementer
        System.out.println("Result : " + opResult);
        opResult += 2;                  // Another Plus Way
        System.out.println("Result : " + opResult);
        opResult -= 1;                  // Another Minus Way
        System.out.println("Result : " + opResult);
        opResult *= 2;                  // Another Multiply Way
        System.out.println("Result : " + opResult);
        opResult /= 2;                  // Another Divide Way
        System.out.println("Result : " + opResult);

        boolean isAlien = false;
        if(isAlien == false)            // Is equal Operator
            System.out.println("It is not an alien");
        else
            System.out.println("It is an alien");

        int topScore = 100;
        if(topScore > 99)               // Greater Operator
            System.out.println("Top Score is bigger than 100");
        else
            System.out.println("Top Score is not bigger than 100");

        if(topScore > 90 || topScore < 110)
            System.out.println("Top Score is bigger than 90 or smaller than 110");

        if(topScore > 90 && topScore < 110)
            System.out.println("Top Score is bigger than 90 and smaller than 110");

        boolean isMan = isAlien ? false : true;
        //******************************************************************************

    }
}
