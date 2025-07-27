// Q3. Create a class named Employee with fields: name, employee ID, designation, and salary.
// a. Create a no-argument constructor that sets default values and prints a message.
// b. Create a parameterized constructor to initialize all fields.
// c. Create a copy constructor.
// In main, create 3 objects using each constructor and display all data.

class Employee {
    String name;
    String empId;
    String designation;
    double salary;

    // No-arg constructor
    Employee() {
        System.out.println("Employee object created using no-arg constructor");
        name = "Default";
        empId = "000";
        designation = "None";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(String name, String empId, String designation, double salary) {
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy constructor
    Employee(Employee e) {
        this.name = e.name;
        this.empId = e.empId;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // No-arg
        Employee e2 = new Employee("Alice", "E101", "Manager", 75000); // Param
        Employee e3 = new Employee(e2); // Copy

        e1.display();
        e2.display();
        e3.display();
    }
}
