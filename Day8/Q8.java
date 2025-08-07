/**8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */
class Student implements Cloneable { // Try removing 'implements Cloneable' to see the exception
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    // Override toString() to display student info
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Department: " + department;
    }

    // Override clone() method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Q8{
    public static void main(String[] args) {
        Student s1 = new Student("Sara", 101, "Computer Science");

        try {
            // Attempt to clone the student
            Student s2 = (Student) s1.clone();

            // Display original and cloned objects
            System.out.println("Original Student: " + s1);
            System.out.println("Cloned Student  : " + s2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}
