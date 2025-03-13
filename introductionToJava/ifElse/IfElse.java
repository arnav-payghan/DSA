package introductionToJava.ifElse;

public class IfElse {
    public static void main(String[] args) {
        // If-Else statements.

        // if ( condition ) {
        //     block of code
        // } else {
        //     block of code
        // }

        int age = 25;   // Change to keep checking the answers.

        if ( age >= 18 ) {
            System.out.println("You are eligible to Vote!");
        } else {
            System.out.println("You are NOT eligible to Vote!");
        }

        age = -10;

        if ( age >= 18 ) {
            System.out.println("You are eligible to Vote!");
        } else if ( age < 0 ){
            System.out.println("You are NOT EVEN BORN YET!");
        } else {
            System.out.println("You are NOT eligible to Vote!");
        }
    }
}
