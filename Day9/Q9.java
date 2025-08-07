/*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
*/
import java.io.*;

class Q9 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Try to read from a file named "Assignment2"
            reader = new BufferedReader(new FileReader("Assignment2"));
            String line;

            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // IOException may occur here
            }

        } catch (FileNotFoundException e) {
            // This block handles if the file is not found
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            // This block handles general I/O errors
            System.out.println("I/O Error while reading: " + e.getMessage());

        } finally {
            System.out.println("Thank you");

            // Attempt to close the file
            try {
                if (reader != null) {
                    reader.close();  // This can also throw IOException
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }
}

