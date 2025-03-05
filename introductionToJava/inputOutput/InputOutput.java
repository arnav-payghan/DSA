package introductionToJava.inputOutput; // Need to update JDK version.

// import java.util.*;     // IMPORTS ALL UTILITY PACKAGES.

public class InputOutput {
    public static void main(String[] args) {
        // Learning of basics --> Introduction, Output, Operators, Data Types.

        // Rule1: Terminate line with a semicolon;
        // Rule2: Java is a case-sensitive language.
        // Rule3: Inside the paranthesis, you can use mathematics.
        // Rule4: Use double quotes for String o/p.
        // Rule5: You can concatenate Sys.print.out(1+1+"Hello"); === 2Hello.
        // Rule6: Operators follow BODMAS/BIDMAS.
        // Rule7: You can't create 2 or more variables with the same name.
        
        System.out.println(4+3*6-7/2);   // Output = 19

        // DATA TYPES : Numbers(Integer, Decimal-->Float(7 decimal digits)), Character(a,b,c), Double(16 decimal digits),
        //              Boolean(T/F), etc.

        // int, float, char, boolean, float, double,

        // INPUTS : Scanner, they need to be closed!

        // Scanner TakeInput = new Scanner(System.in); // TakeInput --> This is just a type of variable/name. [ACTIVATION]

        // int age = TakeInput.nextInt(); // Takes Integer Input.
        // String name = TakeInput.nextLine(); // Takes String Input.

        // TakeInput.close(); // [DEACTIVATION -- CLOSING OF THE SCANNER]

        // System.out.println(name + " is " + age + " years old.");

    }
}
