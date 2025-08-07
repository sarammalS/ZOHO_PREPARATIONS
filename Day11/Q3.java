/*. Write a Java program that reads a file and prints the number of lines, words, and characters.*/
import java.io.*;
class Q3{
    public static void main(String[] args){
        String filepath = "q2.txt"; // Change this to your file name
        int lines = 0, words = 0, characters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();  // Count characters
                String[] wordArray = line.trim().split("\\s+");  // Split by whitespace
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}