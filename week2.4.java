public class week2.4 {
    // Problem 4: Masked Phone Number Formatter
// Concepts: String length/digit validation, substring(), StringBuilder insert(), masking patterns

public class Problem4_MaskedPhoneFormatter {

    // Method to mask phone number showing only the last 4 digits
    public String maskPhoneNumber(String phone) {
        // Check if phone number is null or not exactly 10 characters
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }

        // Check if all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            char ch = phone.charAt(i);
            if (!Character.isDigit(ch)) {
                return "Invalid phone number";
            }
        }

        // Extract the last 4 digits using substring
        String lastFourDigits = phone.substring(6);

        // Use StringBuilder to build masked string
        StringBuilder maskedBuilder = new StringBuilder();
        maskedBuilder.append("XXXXXX");
        maskedBuilder.append(lastFourDigits);

        // Insert '-' between the mask and the last 4 digits (at index 6)
        maskedBuilder.insert(6, "-");

        return maskedBuilder.toString();
    }

    public static void main(String[] args) {
        Problem4_MaskedPhoneFormatter formatter = new Problem4_MaskedPhoneFormatter();

        // Test Case 1: Valid 10-digit number
        String phone1 = "9876543210";
        System.out.println("Input: \"" + phone1 + "\"");
        System.out.println("Output: " + formatter.maskPhoneNumber(phone1));

        System.out.println();

        // Test Case 2: Invalid number (length < 10)
        String phone2 = "98765";
        System.out.println("Input: \"" + phone2 + "\"");
        System.out.println("Output: " + formatter.maskPhoneNumber(phone2));
    }
}

}
