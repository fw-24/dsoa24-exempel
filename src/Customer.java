import java.io.Serializable;

public class Customer implements Serializable {
    private double funds;
    private Bike currentBike;

    public Customer(double funds) {
        this.funds = funds;
    }

    public void buyBike(Bike bike) {
        if (funds < bike.getNetPrice()) {
            System.out.println("Du har inte råd med cykeln!");
            return;
        }
        setFunds(funds - bike.getNetPrice());
        currentBike = bike;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    public void setCurrentBike(Bike currentBike) {
        this.currentBike = currentBike;
    }
}
