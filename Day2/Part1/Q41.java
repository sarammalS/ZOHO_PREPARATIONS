public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5, i = 0;

        do {
            int space = 1, j = 0;
            do {
                if (space <= rows - i)
                    System.out.print(" ");
                space++;
            } while (space <= rows);

            
            int number = 1, k = 0;
            do {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
                k++;
            } while (k <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }
}
/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/
