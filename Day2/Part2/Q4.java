//4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).

import java.util.Scanner;

public class Q4 {
    static void print(int[] x, int n) {
        int single = 0, doubleDigit = 0;
        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9)
                single += x[i];
            else if (x[i] >= 10 && x[i] <= 99)
                doubleDigit += x[i];
        }
        System.out.println("Single digit sum: " + single);
        System.out.println("Double digit sum: " + doubleDigit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter elements:");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        print(arr, len);
    }
}


