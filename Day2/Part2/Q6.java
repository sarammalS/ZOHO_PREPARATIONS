public class Q6 {
    public static void main(String[] args) {
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'o', 'p'};

        boolean identical = true;
        if (X.length != Y.length) {
            identical = false;
        } else {
            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    identical = false;
                    break;
                }
            }
        }

        if (identical)
            System.out.println("Arrays are identical.");
        else
            System.out.println("Arrays are not identical.");
    }
}

