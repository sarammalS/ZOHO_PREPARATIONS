/*int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];*/
class Q1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try {
            int quotient = arr[7] / arr[4];  // arr[7] is invalid, arr[4] is 0
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid index"+e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
