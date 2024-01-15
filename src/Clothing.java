abstract class Clothing {

    double price = 0;
    String brand;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    abstract void mend();

}
