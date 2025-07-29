/* Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.*/
public class Q3 {
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;
        String v = "aeiouAEIOU";

        while (l < r) {
            while (l < r && v.indexOf(ch[l]) == -1) l++;
            while (l < r && v.indexOf(ch[r]) == -1) r--;
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;
            l++;
            r--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));     // holle
        System.out.println(reverseVowels("leetcode"));  // leotcede
    }
}
