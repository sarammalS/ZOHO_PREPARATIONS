/**
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid. */

import java.util.*;

class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 4-digit ATM PIN: ");
        String str = s.nextLine();

        boolean isValid = true;

        // Condition 1: Length must be exactly 4
        if (str.length() != 4) {
            isValid = false;
        }

        // Condition 2: Only numeric characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                isValid = false;
                break;
            }
        }

        // Condition 3: Should not start with '0'
        if (isValid && str.charAt(0) == '0') {
            isValid = false;
        }

        // Final output
        if (isValid) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }
}
