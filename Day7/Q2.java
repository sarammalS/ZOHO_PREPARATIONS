// Q3. Create a Java application to manage employees.
// Base class: Employee with calculateSalary() method
// Subclasses: FullTimeEmployee and PartTimeEmployee override calculateSalary()

abstract class Employee {
    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, String id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, String id, int hours, double rate) {
        super(name, id);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", "FT101", 5000);
        Employee emp2 = new PartTimeEmployee("Bob", "PT202", 80, 25);

        emp1.display();
        emp2.display();
    }
}