import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        if(n%2==0){
            System.out.println("Please enter a odd number");
            return ;
        }
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("1 ");
                }
                else if(i==(n-j-1))
                {
                     System.out.print("1 ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}


