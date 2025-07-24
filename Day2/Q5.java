public class Q5 {
    public static void main(String[] args) {
        int rows = 5, i = 0;
        do {
            int space = 1;
            do {
                if (space++ < rows - i)
                    System.out.print(" ");
                else
                    break;
            } while (true);

            int number = 1, j = 0;
            do {
                if (j <= i) {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                    j++;
                } else {
                    break;
                }
            } while (true);
            System.out.println();
            i++;
        } while (i < rows);
    }
}