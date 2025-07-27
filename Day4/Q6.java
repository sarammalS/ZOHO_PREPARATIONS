/*
*/
import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;

    Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Store class with static and containment
class Store {
    static String storeName;
    static String storeLocation;
    private List<Product> products = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + storeLocation);
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayAllProducts() {
        for (Product p : products) {
            p.displayProduct();
            System.out.println();
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Store.setStoreDetails("TechStore", "New York");

        Product p1 = new Product("P101", "Laptop", 1200.0, 10);
        Product p2 = new Product("P102", "Mouse", 25.0, 50);
        Product p3 = new Product("P103", "Keyboard", 45.0, 30);

        Store store = new Store();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
