package Products;

// Products.Product.java (abstract base class)
public abstract class Product {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void create();
}


