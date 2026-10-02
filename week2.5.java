public class week2.5 {
    // Problem 5: Bank Transaction Reference Generator & Validator
// Concepts: trim(), substring(), string concatenation, Character.isLetter()/isDigit(), StringBuilder, multi-stage validation

public class Problem5_BankReferenceValidator {

    // Method to normalize reference string: trim and uppercase first 3 characters
    public String normalizeReference(String raw) {
        if (raw == null) {
            return "";
        }

        // Trim leading and trailing spaces
        String trimmed = raw.trim();

        // If string is at least 3 characters, uppercase first 3 letters
        if (trimmed.length() >= 3) {
            String firstThree = trimmed.substring(0, 3).toUpperCase();
            String restOfCode = trimmed.substring(3);
            return firstThree + restOfCode;
        }

        return trimmed.toUpperCase();
    }

    // Method to validate and format transaction reference
    public String validateAndFormat(String reference) {
        // Stage 1: Length Validation (Must be exactly 14 characters)
        if (reference.length() != 14) {
            return "Invalid: reference must be 14 characters";
        }

        // Stage 2: Bank Code Validation (First 3 characters must be letters)
        for (int i = 0; i < 3; i++) {
            char ch = reference.charAt(i);
            if (!Character.isLetter(ch)) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Stage 3: Body Validation (Remaining 11 characters must be digits)
        for (int i = 3; i < 14; i++) {
            char ch = reference.charAt(i);
            if (!Character.isDigit(ch)) {
                return "Invalid: remaining 11 characters must be digits";
            }
        }

        // Extract components for formatted display
        String bankCode = reference.substring(0, 3);
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String seq = reference.substring(9, 14);

        // Build formatted display line using StringBuilder
        StringBuilder formattedOutput = new StringBuilder();
        formattedOutput.append("[").append(bankCode).append("] ");
        formattedOutput.append("DATE: ").append(day).append("/").append(month).append("/").append(year);
        formattedOutput.append(" | SEQ: ").append(seq);

        return formattedOutput.toString();
    }

    public static void main(String[] args) {
        Problem5_BankReferenceValidator validator = new Problem5_BankReferenceValidator();

        // Test Case 1: Valid input with spaces and lowercase bank code
        String input1 = " hdf03022600042 ";
        System.out.println("Input: \"" + input1 + "\"");
        String normalized1 = validator.normalizeReference(input1);
        System.out.println("Output: " + validator.validateAndFormat(normalized1));

        System.out.println();

        // Test Case 2: Invalid bank code with numbers
        String input2 = "12F03022600042";
        System.out.println("Input: \"" + input2 + "\"");
        String normalized2 = validator.normalizeReference(input2);
        System.out.println("Output: " + validator.validateAndFormat(normalized2));
    }
}

}
