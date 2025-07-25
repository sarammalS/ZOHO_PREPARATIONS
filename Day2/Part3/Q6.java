public class Q6 {
    public static boolean isSubseq(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubseq("abc", "ahbgdc")); // true
        System.out.println(isSubseq("axc", "ahbgdc")); // false
    }
}
