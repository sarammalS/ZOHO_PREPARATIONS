// Q2. Can we override private method, constructor, static method, final method?
// Answer: No, these cannot be overridden. Here's demonstration:

class Base {
    private void privateMethod() {
        System.out.println("Base private method");
    }

    static void staticMethod() {
        System.out.println("Base static method");
    }

    final void finalMethod() {
        System.out.println("Base final method");
    }

    // Constructor - cannot be overridden
    Base() {
        System.out.println("Base constructor");
    }
}

class Derived extends Base {
    // This is a new method, not an override
    void privateMethod() {
        System.out.println("Derived private-like method");
    }

    
    static void staticMethod() {
        System.out.println("Derived static method");
    }

    // void finalMethod() { System.out.println("Override final"); }
}

public class Q2 {
    public static void main(String[] args) {
        Derived obj = new Derived();

        Base.staticMethod();     
        Derived.staticMethod();

        obj.finalMethod();       
    }
}
