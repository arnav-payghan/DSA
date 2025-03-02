package introductionToJava.dataTypeAndOperators;

public class DataTypeVariables {
    public static void main(String[] args) {
        // VARIABLE RULES:

        // Rule1: Variables can contains lowercase && || uppercase alphabets, digits(1..9), $, _.
        // Rule2: First char/letter cannot be a number.
        // Rule3: Cannot use reserved keywords as variables.
        //                          - public, static, void, main, int, etc.
        
        // NUMBERS : byte, short, int, long. (long x = 100000000000000L)
        // Type Casting is possible --> 
        long y = 1000000000000000000L;
        System.out.println(y);  // Output: 1000000000000000000
        int x = (int)y;
        System.out.println(x);  // Output: -1486618624 Because out of range for int conversion.

    }
}
