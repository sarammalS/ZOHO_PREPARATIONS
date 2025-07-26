class Vehicle {
    int mileage;
    double price;

    Vehicle(int mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }
}

class Car extends Vehicle {
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;

    Car(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
}

class Audi extends Car {
    String modelType;

    Audi(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Audi Model Type: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("-----------------------------");
    }
}

class Ford extends Car {
    String modelType;

    Ford(int mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Ford Model Type: " + modelType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("-----------------------------");
    }
}

class Bike extends Vehicle {
    int noCylinders;
    int noGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;

    Bike(int mileage, double price, int noCylinders, int noGears, String coolingType, String wheelType, int fuelTankSize) {
        super(mileage, price);
        this.noCylinders = noCylinders;
        this.noGears = noGears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }
}

class Bajaj extends Bike {
    String makeType;

    Bajaj(int mileage, double price, int noCylinders, int noGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, noCylinders, noGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    void display() {
        System.out.println("Bike Make Type: " + makeType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Cylinders: " + noCylinders);
        System.out.println("Gears: " + noGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("-----------------------------");
    }
}

class TVS extends Bike {
    String makeType;

    TVS(int mileage, double price, int noCylinders, int noGears, String coolingType, String wheelType, int fuelTankSize, String makeType) {
        super(mileage, price, noCylinders, noGears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    void display() {
        System.out.println("Bike Make Type: " + makeType);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Cylinders: " + noCylinders);
        System.out.println("Gears: " + noGears);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("-----------------------------");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Audi audiCar = new Audi(15, 7000000, 200000, 5, 5, "Petrol", "A4");
        Ford fordCar = new Ford(14, 6000000, 180000, 4, 5, "Diesel", "Endeavour");

        Bajaj bajajBike = new Bajaj(45, 95000, 1, 5, "Air", "Alloys", 13, "Pulsar");
        TVS tvsBike = new TVS(50, 85000, 1, 4, "Oil", "Spokes", 12, "Apache");

        audiCar.display();
        fordCar.display();
        bajajBike.display();
        tvsBike.display();
    }
}

/*Audi Model Type: A4
Mileage: 15
Price: 7000000.0
Ownership Cost: 200000.0
Warranty: 5 years
Seating Capacity: 5
Fuel Type: Petrol
-----------------------------
Ford Model Type: Endeavour
Mileage: 14
Price: 6000000.0
Ownership Cost: 180000.0
Warranty: 4 years
Seating Capacity: 5
Fuel Type: Diesel
-----------------------------
Bike Make Type: Pulsar
Mileage: 45
Price: 95000.0
Cylinders: 1
Gears: 5
Cooling Type: Air
Wheel Type: Alloys
Fuel Tank Size: 13 inches
-----------------------------
Bike Make Type: Apache
Mileage: 50
Price: 85000.0
Cylinders: 1
Gears: 4
Cooling Type: Oil
Wheel Type: Spokes
Fuel Tank Size: 12 inches
-----------------------------
*/
