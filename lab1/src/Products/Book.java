package Products;

// Products.Book.java
public class Book extends Product {
    public Book() {
        this.name = "Products.Book";
        this.price = 19.99;
    }

    @Override
    public void create() {
        System.out.println("Products.Book product created.");
    }
}
