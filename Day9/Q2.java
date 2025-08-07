/*
2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, 
and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.
‌*/import java.util.*;

class Q2 {
    public static int strtono(String s) throws NumberFormatException {
        int num = 0;
        boolean isNegative = false;
        int i = 0;

        if (s.length() == 0) throw new NumberFormatException("Empty string");

        if (s.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        for (; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                throw new NumberFormatException("Invalid character: " + ch);
            }
        }

        return isNegative ? -num : num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            int num1 = strtono(s1);
            int num2 = strtono(s2);

            int result = num1 / num2;
            System.out.println("Result: " + result);
        }

        catch (InputMismatchException e) {
            System.out.println("Input mismatch: please enter valid input.");
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
}
