// Q5. Design a simple inventory system using two classes: Store and Product
// - Store: static variables (storeName, storeLocation), methods to set/display details, maintain list of products
// - Product: ID, name, price, quantity, display method

import java.util.*;

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

public class Q5 {
    public static void main(String[] args) {
        Store.setStoreDetails("SuperTech", "Bangalore");

        Product p1 = new Product("P001", "Monitor", 150.0, 10);
        Product p2 = new Product("P002", "Keyboard", 40.0, 20);
        Product p3 = new Product("P003", "Mouse", 25.0, 50);

        Store store = new Store();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
