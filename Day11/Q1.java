/**
1. Write a Java program to read the contents of a text file and display it on the console. */
import java.io.*;
class Q1{
    public static void main(String[] args){
        String filepath="/home/zs-gsch03/Desktop/ZohoPreparations/Assignment11/Note.txt";
        try(BufferedReader bf= new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
            

        }
        catch(IOException e){
            System.out.println("Error caught:"+e.getMessage());
        }
    }
}