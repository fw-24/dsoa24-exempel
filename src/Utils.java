import java.util.Random;

public class Utils {

    static boolean isInteger(String val) {
        return val.matches("-?[0-9]+");
    }

    static double getRandomPrice() {
        Random rnd = new Random();
        return rnd.nextInt(100, 999);
    }


}
