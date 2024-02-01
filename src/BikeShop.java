import java.util.ArrayList;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public Bike chooseBike() {
        int chosenBike = Utils.getIntInput("Vilken cykel vill du köpa?");
        while (true) {
            try {
                return bikes.get(chosenBike);
            } catch (Exception e) {
                System.out.println("Felaktigt val!");
            }
        }
    }
}
