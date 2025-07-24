import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        int under18 = 0, between18And60 = 0, above60 = 0;

        System.out.println("Enter ages of 10 people:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] < 18)
                under18++;
            else if (ages[i] <= 60)
                between18And60++;
            else
                above60++;
        }

        System.out.println("<18: " + under18);
        System.out.println("18-60: " + between18And60);
        System.out.println(">60: " + above60);
    }
}

