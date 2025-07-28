import java.util.*;

class Employee {
    private int employeeId;
    private String name;
    private String designation;
    private String dept;
    private double monthlySalary;

    // Getters
    public int getId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDept() {
        return dept;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setters
    public void setId(int id) {
        this.employeeId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setMonthlySalary(double salary) {
        this.monthlySalary = salary;
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public void display() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Department: " + getDept());
        System.out.println("Monthly Salary: ₹" + getMonthlySalary());
        System.out.println("Annual Salary: ₹" + getAnnualSalary());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        e.setId(s.nextInt());
        s.nextLine(); 

        System.out.print("Enter Name: ");
        e.setName(s.nextLine());

        System.out.print("Enter Designation: ");
        e.setDesignation(s.nextLine());

        System.out.print("Enter Department: ");
        e.setDept(s.nextLine());

        System.out.print("Enter Monthly Salary: ");
        e.setMonthlySalary(s.nextDouble());

        System.out.println("\n--- Employee Details ---");
        e.display();
    }
}
