import java.util.Random;
import java.util.Scanner;

public class Utils {

    /**
     * Code Challenge: Good input, bad input
     * @return int
     */


    static int getIntInput(String prompt) {
        Scanner console = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt + ": ");
                return Integer.parseInt(console.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            }
        }
    }
    // Overload för att köra metoden utan argument:
    static int getIntInput() {
        return getIntInput("Mata in ett heltal");
    }


    static boolean isInteger(String val) {
        return val.matches("-?[0-9]+");
    }

    static double getRandomPrice() {
        Random rnd = new Random();
        return rnd.nextInt(100, 999);
    }

}
