public class Q1 {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, c = 0;

        while (i >= 0 || j >= 0 || c == 1) {
            int s = c;
            if (i >= 0) s += a.charAt(i--) - '0';
            if (j >= 0) s += b.charAt(j--) - '0';
            sb.append(s % 2);
            c = s / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));     // 100
        System.out.println(addBinary("1010", "1011")); // 10101
    }
}
