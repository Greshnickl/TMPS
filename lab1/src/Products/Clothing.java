package Products;

// Products.Clothing.java
public class Clothing extends Product {
    public Clothing() {
        this.name = "Products.Clothing";
        this.price = 49.99;
    }

    @Override
    public void create() {
        System.out.println("Products.Clothing product created.");
    }
}
