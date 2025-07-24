import java.util.Scanner;

public class Datatypes1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare all data types
        int n;
        double var1;
        float var2;
        long n2;
        char k;
        byte l;

        // Input values
        System.out.print("Enter an integer: ");
        n = input.nextInt();

        System.out.print("Enter a double: ");
        var1 = input.nextDouble();

        System.out.print("Enter a float: ");
        var2 = input.nextFloat();

        System.out.print("Enter a long integer: ");
        n2 = input.nextLong();

        System.out.print("Enter a character: ");
        k = input.next().charAt(0); // read first character

        System.out.print("Enter a byte value: ");
        l = input.nextByte();

        // Output with precision
        System.out.println("\n--- Data Types Output with Precision ---");
        System.out.println("Integer: " + n);
        System.out.printf("Double: %.2f\n", var1);  // 2 decimal places
        System.out.printf("Float: %.2f\n", var2);   // 2 decimal places
        System.out.println("Long: " + n2);
        System.out.println("Character: " + k);
        System.out.println("Byte: " + l);
    }
}