import java.util.ArrayList;

public class BikeShop {

    private ArrayList<Bike> bikes = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }
}
