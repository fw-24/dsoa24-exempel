public interface ShopFeatures {

    double getPrice();

    String getProductNumber();

    default String getCondition() {
        return "Brand new";
    }

}
