import Products.Product;

public class Client {
    public static void main(String[] args) {
        // Create Products using the Factory Method
        Product electronics = ProductFactory.createProduct("Electronics");
        Product clothing = ProductFactory.createProduct("Clothing");
        Product furniture = ProductFactory.createProduct("Furniture");
        Product book = ProductFactory.createProduct("Book");
        Product toy = ProductFactory.createProduct("Toy");

        // Build an Order using the Builder Pattern
        Order order = new Order.OrderBuilder()
                .addProduct(electronics)
                .addProduct(clothing)
                .addProduct(furniture)
                .addProduct(book)
                .addProduct(toy)
                .build();

        // Process the Order using the Singleton OrderProcessor
        OrderProcessor orderProcessor = OrderProcessor.getInstance();
        orderProcessor.processOrder(order);
    }
}

