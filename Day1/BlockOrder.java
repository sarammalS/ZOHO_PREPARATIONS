//Write a program that illustrate the execution order of static block and initializer block
public class BlockOrder {
    // Static block: runs once when class is loaded
    static {
        System.out.println("Static block executed");
    }

    // Instance initializer block: runs before constructor
    {
        System.out.println("Initializer block executed");
    }

    // Constructor
    BlockOrder() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        BlockOrder obj1 = new BlockOrder();
        BlockOrder obj2 = new BlockOrder();
    }
}
/*zs-gsch03@zs-gsch03:~/Desktop/ZohoPreparations/Assignment1$ java BlockOrder
Static block executed
Main method starts
Initializer block executed
Constructor executed
Initializer block executed
Constructor executed */