import java.util.*;

public class Variables {
    // Instance variable
    int i;

    // Static variable
    static int j = 10;

    // Final variable
    final double pi = 3.14;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Local variable
        int k = s.nextInt();  
        System.out.println("Local variable k = " + k);

        // To access instance and final variables, create an object
        Variables obj = new Variables();

        obj.i = s.nextInt();  // Instance variable
        System.out.println("Instance variable i = " + obj.i);

        j++;  // Static variable
        System.out.println("Static variable j = " + j);

        System.out.println("Final variable pi = " + obj.pi);

        // Block variable
        if (k > 0) {
            int blockVar = 99;
            System.out.println("Block variable blockVar = " + blockVar);
        }
        // blockVar is not accessible here — it's block scoped
    }
}