public class week3.1 {
    / M1. From Parallel Arrays to a Class
// Concepts: OOP vs parallel arrays, constructors, arrays of objects, instance methods

class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    // Constructor to initialize all three fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method to print one formatted record line
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class M1_PlacementRecordDemo {

    public static void main(String[] args) {
        // Create an array of PlacementRecord objects
        PlacementRecord[] records = new PlacementRecord[3];

        // Store 3 objects in the array
        records[0] = new PlacementRecord("Ravi", "TCS", 4.5);
        records[1] = new PlacementRecord("Anitha", "Zoho", 6.2);
        records[2] = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Print each record using a loop
        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}

}
