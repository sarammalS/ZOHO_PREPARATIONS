class Animal {
    // Parent class
}

class Dog extends Animal {
    // Child class
}

public class InstanceCheck {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        
        if (myDog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
        } 

        
        if (myDog instanceof Animal) {
            System.out.println("myDog is also an instance of Animal");
        }

        
        if (myDog instanceof Object) {
            System.out.println("myDog is also an instance of Object");
        }
    }
}
