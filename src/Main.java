import java.util.HashMap;

public class Main {

    // konstant skapas med static final
    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {

        // default-konstruktor
        Foo foo = new Foo();

        Bike bike = new Bike("Nishiki", 500);

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(bike);
        bikeShop.addBike(new Bike("Scott", 600));
        bikeShop.addBike(new Bike("Jopo", 300));

        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            Bike currentBike = bikeShop.getBikes().get(i);

            System.out.printf("%d %s %.2f\n",
                    i,
                    currentBike.getName(),
                    currentBike.getPrice()
            );
        }





        Shirt shirt = new Shirt("Gant");
        shirt.setPrice(100);
        System.out.println(shirt.getCondition());

        Car car = new Car("Tesla");

        System.out.println(String.format(
                "Brand: %s, it is %s and it costs %.2f\n",
                car.getName(),
                car.getType(),
                car.getPrice()
        ));

        Car car2 = new Car("Fiat");

        // HashMap
        HashMap<String,Car> drivers = new HashMap<>();
        drivers.put("kalle", car2);
        drivers.put("lisa", car); // Tesla

        // put skriver också över tidigare värden
        drivers.put("lisa", new Car("Toyota"));

        System.out.printf("Kalle drives a %s and Lisa drives a %s\n",
                drivers.get("kalle").getName(),
                drivers.get("lisa").getName()
                );

        System.out.printf(
            "Brand: %s, it is %s and it costs %.2f\n",
            car2.getName(),
            car2.getType(),
            car2.getPrice()
        );

        car.refuel();


        System.out.println("total cars created: " + car.getCarsCreated());
        System.out.println("total cars created: " + car2.getCarsCreated());
    }
}