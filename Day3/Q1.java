// Q1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student1 {
    String name;
    int roll_no;
}

public class Q1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "John";
        s.roll_no = 2;

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll_no);
    }
}
