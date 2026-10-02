import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

// Practice 4: Checked Exceptions (Compiler forces handling with try-catch)
public class CheckedExceptionsDemo {

    // Method to demonstrate checked exception (FileNotFoundException)
    public void openFile(String fileName) {
        try {
            File myFile = new File(fileName);
            // FileReader throws checked FileNotFoundException
            FileReader reader = new FileReader(myFile);
            System.out.println("File opened successfully!");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: File \"" + fileName + "\" was not found!");
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: Error while closing file.");
        } finally {
            System.out.println("Finally block: File operation finished.");
        }
    }

    public static void main(String[] args) {
        CheckedExceptionsDemo obj = new CheckedExceptionsDemo();

        System.out.println("=== Checked Exceptions Demo ===\n");

        // Attempting to open a file that does not exist
        obj.openFile("student_record.txt");
    }
}
