import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rollNo = new int[10];
        int[][] marks = new int[10][3];
        int[] total = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter roll no for student " + (i + 1) + ": ");
            rollNo[i] = sc.nextInt();
            System.out.println("Enter marks in 3 subjects:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
        }

        System.out.printf("%-10s %-15s %-10s\n", "Roll No", "Total Marks", "Average");
        for (int i = 0; i < 10; i++) {
            double avg = total[i] / 3.0;
            System.out.printf("%-10d %-15d %-10.2f\n", rollNo[i], total[i], avg);
        }
    }
}


