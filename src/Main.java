public class Main {
    public static void main(String[] args) {

        // Instansiering av objekt
        Car car = new Car("Tesla");
        Car anotherCar = new Car("Fiat");

        // skriv ut namnet via getter-metoden
        System.out.println(car.getName());

        // Getter och setter
        System.out.println(anotherCar.getName());
        anotherCar.setName("Fiat 500");
        System.out.println(anotherCar.getName());

    }
}