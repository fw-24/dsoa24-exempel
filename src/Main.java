import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        FileUtils.writeTextFile("Hellöu", "hello.txt");
        String fileContent = FileUtils.readTextFile("hello.txt");
        System.out.println(fileContent);

        String saveFile = "customer.save";

        Customer customer;
        try {
            customer = (Customer) FileUtils.loadObject(saveFile);
        } catch (RuntimeException e) {
            System.out.println("Ingen save-fil, skapar ny kund.");
            customer = new Customer(1000);
        }

        if (customer.getCurrentBike() != null) {
            System.out.printf("Din cykel är en %s, du har %.2f funds\n",
                    customer.getCurrentBike().getName(),
                    customer.getFunds());
        } else {
            System.out.println("Du har ingen cykel!");
        }


        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 500, DiscountCategory.DEMO));
        shop.addBike(new Bike("Rossin", 700, DiscountCategory.RETURNED));
        shop.addBike(Bike.createExpensiveBike("Nishiki"));
        shop.addBike(new Bike("Jopo", Utils.getRandomPrice()));



        System.out.println("Välj cykel att köpa:");
        for (int i = 0; i < shop.getBikes().size(); i++) {
            Bike b = shop.getBikes().get(i);
            System.out.printf("[%d] %s kostar %.2f (%s)\n",
                    i,
                    b.getName(),
                    b.getNetPrice(),
                    b.getDiscountCat());
        }

        // Code Challenge: input
        Bike bikeToBuy = shop.chooseBike();

        customer.buyBike(bikeToBuy);

        System.out.printf("Du har nu en %s, du har %.2f funds kvar\n",
                customer.getCurrentBike().getName(),
                customer.getFunds());

        FileUtils.saveObject(customer, saveFile);




    }
}