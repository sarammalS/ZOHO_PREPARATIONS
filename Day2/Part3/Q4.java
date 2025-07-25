public class Q4 {
    public static char findDiff(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) res ^= c;
        for (char c : t.toCharArray()) res ^= c;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findDiff("abcd", "abcde")); // e
        System.out.println(findDiff("", "y"));         // y
    }
}
