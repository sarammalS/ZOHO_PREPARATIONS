/*
2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/
import arith.*;
import java.util.*;
import stringutils.*;
public class Q1{

public static void main(String[] args){
    Arithmetic f= new Arithmetic();
    Stringutil d= new Stringutil();
    Scanner s= new Scanner(System.in);
    int a= s.nextInt();

    int b= s.nextInt();
    s.nextLine();
        System.out.println("Addition: " + f.add(a,b));
        System.out.println("Subtraction: " + f.sub(a,b));
        System.out.println("Multiplication: " + f.mul(a,b));
        System.out.println("Division: " + f.div(a,b));
        System.out.println("Modulo: " + f.mod(a,b));
    
    String str1= s.nextLine();
    
    String str2=s.nextLine();
        System.out.println("Concat:"+d.concat(str1,str2));
        System.out.println("Reverse str1:"+d.reverse(str1));
        System.out.println("Reverse str2:"+d.reverse(str2));
        System.out.println("Length Str1:"+d.lengthh(str1));
         System.out.println("Length Str2:"+d.lengthh(str2));
        


}
}