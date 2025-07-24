//Minimum of three numbers

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double minimum = num1;

        
        if (num2 < minimum) {
            minimum = num2;
        }

        // Compare with num3
        if (num3 < minimum) {
            minimum = num3;
        }

          System.out.println("The minimum of the three numbers is: " + minimum);

        scanner.close();
    }
}