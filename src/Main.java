import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /**
         * Tips för att swappa mellan två objekt
         */
        Vehicle bike = new Bike("cykel");
        Vehicle car = new Car("bil");

        Vehicle todaysRide = bike;
        Vehicle tomorrowsRide = car;
        Vehicle tempRide;

        // Vi byter fordon varje dag
        for (int i = 1; i < 7; i++) {
            System.out.println("-- Dag " + i);
            System.out.printf("I dag åker jag %s, imorgon åker jag %s\n",
                    todaysRide.getName(),
                    tomorrowsRide.getName());

            // Man kan skilja på objekten med en enkel if-sats vid behov
            if (todaysRide == bike) {
                System.out.println("Det var duktigt av dig!");
            }

            // Själva swappen
            tempRide = todaysRide;
            todaysRide = tomorrowsRide;
            tomorrowsRide = tempRide;

        }
        /* objekt-swapping end */


        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 500));
        shop.addBike(Bike.createExpensiveBike("Nishiki"));
        shop.addBike(new Bike("Jopo", Utils.getRandomPrice()));

        System.out.println("Välj cykel att köpa:");
        for (int i = 0; i < shop.getBikes().size(); i++) {
            Bike b = shop.getBikes().get(i);
            System.out.printf("[%d] %s kostar %.2f\n",
                    i,
                    b.getName(),
                    b.getPrice());
        }

        // Code Challenge: input
        int chosenBike = Utils.getIntInput("Vilken cykel vill du köpa?");
        System.out.printf("Grattis, du äger en %s", shop.getBikes().get(chosenBike).getName());

        // Code Challenge: input Overload-variant
        System.out.println("----");
        int myInt = Utils.getIntInput();

        System.out.println("Du skrev: " + myInt);



    }
}