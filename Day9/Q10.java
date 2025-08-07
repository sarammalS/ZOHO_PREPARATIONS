/*10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. 
Display appropriate messages for eligible and ineligible voters.*/
import java.util.*;
class customException2 extends Exception{
    public customException2(String m){
        super(m);
    }
}
class Q10{
    public static void main(String[] args)throws customException2{
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Age:");
        int i= s.nextInt();
        try{
            if(i<18){
                throw new customException2("Not eligible");
            }
            else{
                System.out.println("Eligible");
            }
        }
        catch(customException2 e){
            System.out.println(e.getMessage());
        }


    }
}