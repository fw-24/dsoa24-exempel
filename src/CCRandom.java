import java.util.Random;
import java.util.Scanner;

public class CCRandom {
    static void generate() {
        Scanner console = new Scanner(System.in);

        System.out.println("Random Rundown");
        Random rnd = new Random();


        /*

        do {
            System.out.printf("Slumptal: %d\n", rnd.nextInt(100));
            System.out.printf("Tryck Enter för ett nytt tal, q för att avsluta: ");
        } while (!console.nextLine().equals("q"));

        */


        while (true) {
            System.out.printf("Slumptal: %d\n", rnd.nextInt(100));
            System.out.printf("Tryck Enter för ett nytt tal, q för att avsluta: ");

            if (console.nextLine().equals("q")) break;

        }

        System.out.println("Hej då!");



    }

}
