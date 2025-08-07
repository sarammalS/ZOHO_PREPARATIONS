//Write a program to take in 10 values and print only those numbers which are prime.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}

// public static void sieveOfEratosthenes(int n) {
//         // Step 1: Create a boolean array "prime[0..n]"
//         boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true); // Assume all numbers are prime initially

//         isPrime[0] = false;
//         isPrime[1] = false;

//         // Step 2: Start from the first prime number (2)
//         for (int p = 2; p * p <= n; p++) {
//             // If isPrime[p] is still true, mark all its multiples as false
//             if (isPrime[p]) {
//                 for (int i = p * p; i <= n; i += p) {
//                     isPrime[i] = false;
//                 }
//             }
//         }
