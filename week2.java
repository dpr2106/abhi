public class week2.2 {
    // Problem 2: CSV Student Record Parser
// Concepts: split(), array length validation, string concatenation, formatted output

public class Problem2_CsvStudentParser {

    // Method to parse and format student CSV record
    public void parseStudentRecord(String csvLine) {
        // Split line by comma
        String[] fields = csvLine.split(",");

        // Validate that exactly 3 fields exist: Name, RollNumber, Department
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Extract fields (with trim to remove extra spaces if any)
        String name = fields[0].trim();
        String rollNumber = fields[1].trim();
        String department = fields[2].trim();

        // Print formatted record
        System.out.println("Name: " + name + " | Roll No: " + rollNumber + " | Dept: " + department);
    }

    public static void main(String[] args) {
        Problem2_CsvStudentParser parser = new Problem2_CsvStudentParser();

        // Test Case 1: Valid record
        String record1 = "Ananya Verma,RA2211003010123,CSE";
        System.out.println("Input: \"" + record1 + "\"");
        System.out.print("Output: ");
        parser.parseStudentRecord(record1);

        System.out.println();

        // Test Case 2: Invalid record (only 2 fields)
        String record2 = "Ananya Verma,CSE";
        System.out.println("Input: \"" + record2 + "\"");
        System.out.print("Output: ");
        parser.parseStudentRecord(record2);
    }
}

}
