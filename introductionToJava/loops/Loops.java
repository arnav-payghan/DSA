package introductionToJava.loops;

public class Loops {
    public static void main(String[] args) {
        // FOR LOOPS
        int count = 1;
        for (int i=0; i<10; i++) {
            System.out.println(count);
            count++;
        }

        System.out.println("");

        // WHILE LOOPS
        int j = 1;
        while (j <= 5) {
            System.out.println(j);  
            j++;
        }

        System.out.println("");

        // DO-WHILE LOOPS TRUE CONDITION
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        System.out.println("");

        // DO-WHILE LOOPS FALSE CONDITION : Will do it atleast once.
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a >= 10);

    }
}
