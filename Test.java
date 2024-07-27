import java.util.*;

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

        List<String> janken = Arrays.asList("Scissors", "Stone", "Hand", "Spock");
        if (janken.contains(o)) {
            if (janken.indexOf(o) == janken.size() - 1){
                System.out.println(janken.get(0));
            } else {
                System.out.println(janken.get(janken.indexOf(o) + 1));
            }
        } else {
            System.out.println("Error");
        }
    }
}
