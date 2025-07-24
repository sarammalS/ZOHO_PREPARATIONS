public class Q4{
    public static void main(String[] args) {
        int i = 1, num = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }

        i = 2;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
/*
1
2 3
4 5 6
7 8
9
*/
/*public class PatternB {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }

        i = 2;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
*/