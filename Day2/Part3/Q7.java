public class Q7 {
    public static int countSeg(String s) {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countSeg("Hello, my name is John")); // 5
        System.out.println(countSeg("Hello"));                  // 1
    }
}
