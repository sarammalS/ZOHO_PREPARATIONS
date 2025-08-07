/*4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. 
Handle it using try-catch.
‌*/


import java.util.*;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        try {
            int num = parseStringToInt(s);
            System.out.println("Parsed Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static int parseStringToInt(String s) throws NumberFormatException {
        if (s.length() == 0) {
            throw new NumberFormatException("Empty String");
        }

        int num = 0;
        boolean isNegative = false;
        int i = 0;

        

        for (i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) == '-') {
            isNegative = true;
            continue;
            }
        
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                throw new NumberFormatException("Not a valid number: " + s);
            }
        }

        return isNegative ? -num : num;
    }
}
