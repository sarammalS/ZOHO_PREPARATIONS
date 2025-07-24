public class Q6{
    public static int sumEven(int n) {
        int sum = 0, i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of even numbers up to 10: " + sumEven(10));
    }
}