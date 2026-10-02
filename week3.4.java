public class week3.4 {
    // M4. Reference Copies and a Shared ID Card
// Concepts: Reference copying, ==, object identity vs content equality

class IdCard {
    String name;
    int booksIssued;

    // Constructor
    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }
}

public class M4_IdCardReferenceDemo {

    public static void main(String[] args) {
        // Step 1: Create original IdCard object for Ravi
        IdCard ravi = new IdCard("Ravi", 0);

        // Step 2: Assign duplicate to point to the exact same object reference
        IdCard duplicate = ravi;

        // Step 3: Change booksIssued through the second variable
        duplicate.booksIssued = 3;

        // Step 4: Create a third, separate IdCard with identical values
        IdCard separate = new IdCard("Ravi", 3);

        // Print value seen through first variable
        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);

        // Print reference comparisons using ==
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}

}
