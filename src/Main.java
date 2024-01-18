import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // konstant skapas med static final
    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {

        Random random = new Random();

        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        System.out.printf("Skriv q för att avsluta: ");
        if (strInput.nextLine().equals("q")) {
            System.out.println("Hej då!");
            System.exit(0);
        }
        System.out.println();

        CCCalculator calc = new CCCalculator();
        System.out.println(calc.multiply(3, 5));
        System.out.println(calc.multiply(3, 5, 10));

        while (true) {
            try {
                System.out.printf("Skriv ett tal att multiplicera med 5: ");
                // Integer.parseInt() konverterar text till heltal jft JS Number()
                int userIntInput = Integer.parseInt(strInput.nextLine());

                System.out.printf("Svar: 5 * %d = %.0f\n",
                        userIntInput,
                        calc.multiply(5, userIntInput)
                );
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (Exception e) {
                System.out.println("Någonting gick fel");
            }
        }

        System.out.printf("Skriv ett tal att multiplicera: ");
        int userIntInput1 = intInput.nextInt();
        System.out.printf("Skriv ett tal till: ");
        int userIntInput2 = intInput.nextInt();

        System.out.printf("Svar: %d * %d = %.0f\n",
                userIntInput1,
                userIntInput2,
                calc.multiply(userIntInput1, userIntInput2)
        );

        System.out.printf("Skriv ditt namn: ");
        String userName = strInput.nextLine();
        System.out.printf("Hej %s!\n", userName);

        // Random
        System.out.println(random.nextInt(99));
        System.out.println(random.nextInt(100, 999));
    }
}