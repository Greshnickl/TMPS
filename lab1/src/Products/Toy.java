package Products;

// Products.Toy.java
public class Toy extends Product {
    public Toy() {
        this.name = "Products.Toy";
        this.price = 24.99;
    }

    @Override
    public void create() {
        System.out.println("Products.Toy product created.");
    }
}
