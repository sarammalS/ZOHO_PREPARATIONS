/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌*/
public class Q2 {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) ('A' + n % 26));
            n /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // A
        System.out.println(convertToTitle(28));  // AB
        System.out.println(convertToTitle(701)); // ZY
    }
}
/*import java.util.*;

public class Q4 {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        // Count each character in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return c; // This is the extra character
            }
            map.put(c, map.get(c) - 1);
        }

        return ' '; // Should never reach here
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String t1 = "abcde";
        System.out.println("Extra letter: " + findTheDifference(s1, t1)); // Output: e

        String s2 = "";
        String t2 = "y";
        System.out.println("Extra letter: " + findTheDifference(s2, t2)); // Output: y
    }
}
*/
