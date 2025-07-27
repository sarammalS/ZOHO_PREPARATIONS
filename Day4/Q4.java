/*4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.*/
class A {
    void show() {
        System.out.println("A");
    }
}

class B {
    void show() {
        System.out.println("B");
    }
}

// This will cause error: class C cannot extend A and B
// class C extends A, B {
// }
