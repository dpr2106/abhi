public class week22.3 {
    // Problem 3: Product Inventory CSV Parser
// Concepts: split(), array length validation, string concatenation, formatted output

public class Problem3_InventoryCsvParser {

    // Method to parse and print formatted product record
    public void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        // Check if exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Extract fields
        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String quantity = fields[2].trim();

        // Print formatted record
        System.out.println("Product: " + productName + " | SKU: " + sku + " | Qty: " + quantity);
    }

    public static void main(String[] args) {
        Problem3_InventoryCsvParser parser = new Problem3_InventoryCsvParser();

        // Test Case 1: Valid record
        String line1 = "Wireless Mouse,WM-2201,150";
        System.out.println("Input: \"" + line1 + "\"");
        System.out.print("Output: ");
        parser.parseInventoryRecord(line1);

        System.out.println();

        // Test Case 2: Invalid record
        String line2 = "Wireless Mouse,150";
        System.out.println("Input: \"" + line2 + "\"");
        System.out.print("Output: ");
        parser.parseInventoryRecord(line2);
    }
}

}
