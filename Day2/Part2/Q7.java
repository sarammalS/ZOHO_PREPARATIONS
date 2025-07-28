//Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weight = new double[10];

        System.out.println("Enter weights of 10 people:");
        for (int i = 0; i < 10; i++) {
            weight[i] = sc.nextDouble();
        }

        for (int i = 0; i < 9; i++) {
            int max = i;
            for (int j = i + 1; j < 10; j++) {
                if (weight[j] > weight[max]) {
                    max = j;
                }
            }
            double temp = weight[i];
            weight[i] = weight[max];
            weight[max] = temp;
        }

        System.out.println("Weights in descending order:");
        for (double w : weight) {
            System.out.print(w + " ");
        }
    }
}


