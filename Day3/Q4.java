// Q4. Design the Vehicle class that stores information about a vehicle (vehicle ID, brand name, price).
// Internally keep track of how many vehicles have been created using a static variable.

class Vehicle {
    String vehicleId;
    String brandName;
    double price;
    static int count = 0;

    Vehicle(String vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brandName);
        System.out.println("Price: $" + price);
    }

    static void displayCount() {
        System.out.println("Total vehicles created: " + count);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V001", "Toyota", 20000);
        Vehicle v2 = new Vehicle("V002", "Honda", 22000);
        Vehicle v3 = new Vehicle("V003", "Ford", 25000);

        v1.display();
        v2.display();
        v3.display();

        Vehicle.displayCount();
    }
}
