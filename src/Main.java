import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        FileUtils.writeTextFile("Hellöu", "hello.txt");
        String fileContent = FileUtils.readTextFile("hello.txt");
        System.out.println(fileContent);

        Customer customer = new Customer(1000);

        if (customer.getCurrentBike() != null) {
            System.out.printf("Din cykel är en %s, du har %.2f funds\n",
                    customer.getCurrentBike().getName(),
                    customer.getFunds());
        } else {
            System.out.println("Du har ingen cykel!");
        }


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
        Bike bikeToBuy = shop.chooseBike();

        customer.buyBike(bikeToBuy);

        System.out.printf("Du har en %s", customer.getCurrentBike().getName());

        FileUtils.saveObject(customer, "customer.sav");




    }
}