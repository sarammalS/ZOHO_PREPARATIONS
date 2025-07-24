//Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
class Employee {
    int empId;
    String name;
    String department;
    double salary;

    // Parameterized constructor
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sara", "IT", 15000);
        emp.display();
    }
}
/*Employee ID: 101
Name: Sara
Department: IT
Salary: 15000.0
*/