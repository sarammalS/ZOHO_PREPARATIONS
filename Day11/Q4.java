/**
4. Write a Java program to append a text read from the user to an existing file without overwriting the original content. */
import java.io.*;
import java.util.*;
class Q4{
    public static void main(String[] args){
        String filepath="q2.txt";
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        try(FileWriter f= new FileWriter(filepath,true)){
            f.write(str);
            f.close();
            System.out.println("File append successfully");
        }catch(IOException e){
            System.out.println("Error caught");
        }
    }
}