// Q3. Create a Java application to manage employees.
// Base class: Employee with calculateSalary() method
// Subclasses: FullTimeEmployee and PartTimeEmployee override calculateSalary()

interface Employee {
    
    double calculateSalary();

    void display();
}

class FullTimeEmployee implements Employee {
    double monthlySalary;
    String name;
    String id;

    
        
    
    FullTimeEmployee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = salary;
    }

    
    public double calculateSalary() {
        return monthlySalary;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + calculateSalary());
    }
}

class PartTimeEmployee implements Employee {
    int hoursWorked;
    double hourlyRate;
    String name;
    String id;

    PartTimeEmployee(String name, String id, int hours, double rate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + calculateSalary());
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", "FT101", 5000);
        Employee emp2 = new PartTimeEmployee("Bob", "PT202", 80, 25);

        emp1.display();
        emp2.display();
    }
}