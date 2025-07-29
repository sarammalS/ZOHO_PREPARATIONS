/*
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.*/public class Q5{
    public static String addStr(String n1, String n2) {
        StringBuilder sb = new StringBuilder();
        int i = n1.length() - 1, j = n2.length() - 1, c = 0;

        while (i >= 0 || j >= 0 || c > 0) {
            int d1 = (i >= 0) ? n1.charAt(i--) - '0' : 0;
            int d2 = (j >= 0) ? n2.charAt(j--) - '0' : 0;
            int sum = d1 + d2 + c;
            sb.append(sum % 10);
            c = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStr("11", "123"));   // 134
        System.out.println(addStr("456", "77"));   // 533
        System.out.println(addStr("0", "0"));      // 0
    }
}
