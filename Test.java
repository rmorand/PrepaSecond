import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Test {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String o = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        if (o.equals("Scissors")) {
            System.out.println("Stone");
        }
        if (in.equals("Stone")) {
            System.out.println("Hand");
        }
        if (in.equals("Hand")) {
            System.out.println("Scissors");
        } else {
            System.out.println("Error");
        }
    }
}
