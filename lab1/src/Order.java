import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;

    private Order(OrderBuilder builder) {
        this.products = builder.products;
        this.totalPrice = builder.totalPrice;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public static class OrderBuilder {
        private List<Product> products = new ArrayList<>();
        private double totalPrice = 0.0;

        public OrderBuilder addProduct(Product product) {
            this.products.add(product);
            this.totalPrice += product.getPrice();
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
