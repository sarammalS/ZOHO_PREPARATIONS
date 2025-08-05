/*4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.*/
// Base class A
class A {
    void displayA() {
        System.out.println("Class A method");
    }
}

// Base class B
class B {
    void displayB() {
        System.out.println("Class B method");
    }
}

// Trying to inherit both A and B
// This will cause a **COMPILATION ERROR**
// class C extends A, B { // Not allowed in Java
//     void displayC() {
//         System.out.println("Class C method");
//     }
// }

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Java does NOT support multiple inheritance with classes directly.");
        System.out.println("Uncommenting the line 'class C extends A, B' will cause a compilation error.");
    }
}
