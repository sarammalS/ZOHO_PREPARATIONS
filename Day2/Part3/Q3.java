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
