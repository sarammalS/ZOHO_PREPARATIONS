/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/
public class Q8 {
    public static boolean isValidCap(String w) {
        return w.equals(w.toUpperCase()) ||
               w.equals(w.toLowerCase()) ||
               (Character.isUpperCase(w.charAt(0)) &&
               w.substring(1).equals(w.substring(1).toLowerCase()));
    }

    public static void main(String[] args) {
        System.out.println(isValidCap("USA"));   // true
        System.out.println(isValidCap("FlaG"));  // false
    }
}
