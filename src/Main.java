import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner strInput = new Scanner(System.in);

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 500));
        shop.addBike(new Bike("Nishiki", Utils.getRandomPrice()));
        shop.addBike(new Bike("Jopo", Utils.getRandomPrice()));

        System.out.println("Välj cykel att köpa:");
        for (int i = 0; i < shop.getBikes().size(); i++) {
            Bike bike = shop.getBikes().get(i);
            System.out.printf("[%d] %s kostar %.2f\n",
                    i,
                    bike.getName(),
                    bike.getPrice());
        }

        int chosenBike;
        while (true) {
            System.out.println("Vilken cykel vill du köpa?");

            String userInput = strInput.nextLine();

            if (Utils.isInteger(userInput)) {
                chosenBike = Integer.parseInt(userInput);
                break;
            }
            System.out.println("Du måste ge ett tal!");

        }
        System.out.printf("Grattis, du äger en %s",
                shop.getBikes().get(chosenBike).getName());
        //CCRandom.generate();


    }
}