import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Top horizontal line
                if (i == 1 && j <= n - 1) {
                    System.out.print("*");
                }
                // Left vertical line
                else if (j == 1) {
                    System.out.print("*");
                }
                // Middle horizontal line
                else if (i == (n / 2) + 1 && j <= n - 1) {
                    System.out.print("*");
                }
                // Right  top half
                else if (j == n && i <= n / 2 && i != 1) {
                    System.out.print("*");
                }
                // Diagonal 
                else if (i > (n / 2 + 1) && j == i - n / 2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
**** 
*   *
**** 
**    
* *    */