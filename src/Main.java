import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner strInput = new Scanner(System.in);

        BikeShop shop = new BikeShop();
        shop.addBike(new Bike("Scott", 200));
        shop.addBike(new Bike("Nishiki", 400));
        shop.addBike(new Bike("Jopo", 100));

        System.out.println("Välj cykel att köpa:");
        for (int i = 0; i < shop.getBikes().size(); i++) {
            Bike bike = shop.getBikes().get(i);
            System.out.printf("[%d] %s kostar %.2f\n",
                    i,
                    bike.getName(),
                    bike.getPrice());
        }





        //CCRandom.generate();


    }
}