// Q6. Write a program to print information (name, year of joining, salary, address) of 3 employees.
// Format output using formatting methods.

class Employee6 {
    String name;
    int year;
    String address;

    Employee6(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-15d %-20s\n", name, year, address);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Employee6 e1 = new Employee6("Robert", 1994, "64C- WallsStreat");
        Employee6 e2 = new Employee6("Sam", 2000, "68D- WallsStreat");
        Employee6 e3 = new Employee6("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
        e1.display();
        e2.display();
        e3.display();
    }
}
