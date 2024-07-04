import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create CartManager and add products
    }
}

class Product {
    // Generic attributes for a product
}

class Book extends Product {
    protected String ISBN;

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Book: ISBN=" + ISBN;
    }
}

class Electronic extends Product {
    protected int wattage;

    public Electronic(int wattage) {
        this.wattage = wattage;
    }

    public String toString() {
        return "Electronic: Wattage=" + wattage + " watts";
    }
}

class Clothing extends Product {
    protected String size;

    public Clothing(String size) {
        this.size = size;
    }

    public String toString() {
        return "Clothing: Size=" + size;
    }
}

class CartManager {
    List<Product> cartItems;

    public CartManager() {
        cartItems = new ArrayList<>();
    }

    void addProduct(Product product) {
        cartItems.add(product);
    }

    void displayCart() {
        for (Product item : cartItems) {
            System.out.println(item);
        }
    }
}