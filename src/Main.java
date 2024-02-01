import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        FileUtils.writeTextFile("Hellöu", "hello.txt");

        String fileContent = FileUtils.readTextFile("hello.txt");

        System.out.println(fileContent);

        System.exit(0);


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