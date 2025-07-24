import java.util.*;

public class Ternary {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int k=(a>b)?a:b;
        System.out.println("MAximum:"+k);
    }
}