/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/
public class Q7 {
    public static int countSeg(String s) {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countSeg("Hello, my name is John")); // 5
        System.out.println(countSeg("Hello"));                  // 1
    }
}
