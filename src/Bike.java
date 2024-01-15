public class Bike extends Vehicle implements ShopFeatures {

    private double price = 0;

    public Bike(String name) {
        super(name, "Pedaled");
    }
    public Bike(String name, double price) {
        super(name, "Pedaled");
        this.price = price;
    }

    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }

    @Override
    public String getProductNumber() {
        return null;
    }

    public double getPrice() {
        return price;
    }

}
