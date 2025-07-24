//write a program to check if a number is a power of 2
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }
    }
}