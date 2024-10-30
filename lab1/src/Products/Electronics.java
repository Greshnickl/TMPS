package Products;

// Products.Electronics.java
public class Electronics extends Product {
    public Electronics() {
        this.name = "Products.Electronics";
        this.price = 199.99;
    }

    @Override
    public void create() {
        System.out.println("Products.Electronics product created.");
    }
}
