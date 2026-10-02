public class week2.3 {
    // Problem 3: File Extension Validator
// Concepts: lastIndexOf(), substring(), equalsIgnoreCase(), conditional logic

public class Problem3_FileExtensionValidator {

    // Method to validate file extension against allowed types (pdf, docx, zip)
    public String validateFileExtension(String filename) {
        // Find the index of the last dot
        int dotIndex = filename.lastIndexOf('.');

        // If there is no dot or it is at the end of the filename
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }

        // Extract extension (everything after the last dot)
        String extension = filename.substring(dotIndex + 1);

        // Compare case-insensitively against allowed extensions
        if (extension.equalsIgnoreCase("pdf") || 
            extension.equalsIgnoreCase("docx") || 
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected - invalid file type";
        }
    }

    public static void main(String[] args) {
        Problem3_FileExtensionValidator validator = new Problem3_FileExtensionValidator();

        // Test Case 1: PDF file
        String file1 = "Assignment1.PDF";
        System.out.println("Input: \"" + file1 + "\"");
        System.out.println("Output: " + validator.validateFileExtension(file1));

        System.out.println();

        // Test Case 2: txt file
        String file2 = "notes.txt";
        System.out.println("Input: \"" + file2 + "\"");
        System.out.println("Output: " + validator.validateFileExtension(file2));
    }
}

}
