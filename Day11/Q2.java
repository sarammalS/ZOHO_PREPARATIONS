/**2. Write a Menu driven Java program 
a) to read content from the user and write it into another file 
b) from the file to another file
c) to modify the content of a file 
d) to search for a particular word in a file and display how many times it appears 
e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
 */
import java.util.*;
import java.io.*;

class Q2 {

    public static void writeUserInputToFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter content:");
        String str = sc.nextLine();
        String file = "q2.txt";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(str);
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }

    public static void copyFile() {
        String s1 = "q2.txt";
        String s2 = "q3.txt";
        try (BufferedReader bf = new BufferedReader(new FileReader(s1));
             FileWriter writer = new FileWriter(s2)) {

            String line;
            while ((line = bf.readLine()) != null) {
                writer.write(line + "\n");
            }
            System.out.println("Copied from source to destination.");

        } catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }

    public static void modifyFileContent() {
        StringBuilder oldContent = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        try (BufferedReader bf = new BufferedReader(new FileReader("q2.txt"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                oldContent.append(line).append("\n");
            }

            String newc = oldContent.toString().replaceAll(oldWord, newWord);

            try (FileWriter w = new FileWriter("q2.txt")) {
                w.write(newc);
            }

            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }

    public static void searchWordInFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String searchWord = sc.next().toLowerCase();
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("q2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (word.equals(searchWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + searchWord + "' appears " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void convertTxtToCsv() {
        String inputFile = "products.txt";
        String outputFile = "products.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line); // Write product name as is
                bw.newLine();
            }
            System.out.println("Products copied to CSV file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== FILE HANDLING MENU =====");
        System.out.println("1. Write content from user to a file (q2.txt)");
        System.out.println("2. Copy content from one file to another");
        System.out.println("3. Modify the content of a file");
        System.out.println("4. Search for a word in a file");
        System.out.println("5. Convert list of products in .txt file to .csv file");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        switch (choice) {
            case 1:
                writeUserInputToFile();
                break;
            case 2:
                copyFile();
                break;
            case 3:
                modifyFileContent();
                break;
            case 4:
                searchWordInFile();
                break;
            case 5:
                convertTxtToCsv();
                break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}