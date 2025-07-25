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
