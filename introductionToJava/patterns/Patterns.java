package introductionToJava.patterns;

public class Patterns {
    public static void main(String[] args) {
        // Pattern making in Java.

        for (int i = 0; i<5; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("x ");
            }
            System.out.println("");
        }

        // For given integer N, draw it's square, take N as 3 and 5.

        for (int N=0; N<5; N++) {
            for (int C=0; C<5; C++) {
                System.out.print("x ");
            }
            System.out.println("");
        }
    }
}