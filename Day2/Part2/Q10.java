
import java.util.Scanner;

public class Q10 {
    static void input(int[][] A, int m, int n, Scanner sc) {
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
    }

    static void display(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    static void totalSum(int[][] A, int m, int n) {
        int sum = 0



;

for (int[] row : A)

for (int val : row)

sum += val;

System.out.println("Sum of all elements: " + sum);

}

static void rowSum(int[][] A, int m, int n) {
    for (int i = 0; i < m; i++) {
        int sum = 0;
        for (int j = 0; j < n; j++)
            sum += A[i][j];
        System.out.println("Row " + i + " sum: " + sum);
    }
}

static void colSum(int[][] A, int m, int n) {
    for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int i = 0; i < m; i++)
            sum += A[i][j];
        System.out.println("Column " + j + " sum: " + sum);
    }
}

static void transpose(int[][] A, int m, int n) {
    System.out.println("Transpose:");
    for (int j = 0; j < n; j++) {
        for (int i = 0; i < m; i++)
            System.out.print(A[i][j] + " ");
        System.out.println();
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = 3, n = 3;
    int[][] A = new int[m][n];

    while (true) {
        System.out.println("\nMENU");
        System.out.println("1. Input Matrix");
        System.out.println("2. Display Matrix");
        System.out.println("3. Sum of all elements");
        System.out.println("4. Row-wise sum");
        System.out.println("5. Column-wise sum");
        System.out.println("6. Transpose");
        System.out.println("7. Exit");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: input(A, m, n, sc); break;
            case 2: display(A, m, n); break;
            case 3: totalSum(A, m, n); break;
            case 4: rowSum(A, m, n); break;
            case 5: colSum(A, m, n); break;
            case 6: transpose(A, m, n); break;
            case 7: System.exit(0);
            default: System.out.println("Invalid choice.");
        }
    }
}

}