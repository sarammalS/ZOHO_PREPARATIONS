//Sum of all of odd numbers in an array
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
    
        System.out.println("Sum of all odd numbers: " + sum);
    }
}
