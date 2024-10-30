import Products.*;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "Electronics":
                return new Electronics();
            case "Clothing":
                return new Clothing();
            case "Furniture":
                return new Furniture();
            case "Book":
                return new Book();
            case "Toy":
                return new Toy();
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
