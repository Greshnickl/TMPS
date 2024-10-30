package Products;

// Products.Furniture.java
public class Furniture extends Product {
    public Furniture() {
        this.name = "Products.Furniture";
        this.price = 299.99;
    }

    @Override
    public void create() {
        System.out.println("Products.Furniture product created.");
    }
}
