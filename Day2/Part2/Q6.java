/*
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/
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

