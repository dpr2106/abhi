public class week24.4 {
    // Problem 4: Library ISBN Normalizer & Validator
// Concepts: trim(), substring(), string concatenation, Character.isLetter()/isDigit(), StringBuilder, multi-stage validation

public class Problem4_IsbnNormalizer {

    // Method to normalize ISBN code: trim spaces and uppercase first 3 letters
    public String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }

        String trimmed = raw.trim();

        // Uppercase only the first 3 characters if length >= 3
        if (trimmed.length() >= 3) {
            String firstThree = trimmed.substring(0, 3).toUpperCase();
            String rest = trimmed.substring(3);
            return firstThree + rest;
        }

        return trimmed.toUpperCase();
    }

    // Method to validate and format ISBN code
    public String validateAndFormat(String code) {
        // Stage 1: Length check (must be exactly 13 characters)
        if (code.length() != 13) {
            return "Invalid: code must be 13 characters";
        }

        // Stage 2: Publisher code check (first 3 must be letters)
        for (int i = 0; i < 3; i++) {
            char ch = code.charAt(i);
            if (!Character.isLetter(ch)) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Stage 3: Body check (remaining 10 must be digits)
        for (int i = 3; i < 13; i++) {
            char ch = code.charAt(i);
            if (!Character.isDigit(ch)) {
                return "Invalid: remaining 10 characters must be digits";
            }
        }

        // Extract components
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        // Build formatted display using StringBuilder
        StringBuilder formatted = new StringBuilder();
        formatted.append("[").append(pubCode).append("] ");
        formatted.append("YEAR: ").append(year);
        formatted.append(" | CATALOG: ").append(catalog);

        return formatted.toString();
    }

    public static void main(String[] args) {
        Problem4_IsbnNormalizer validator = new Problem4_IsbnNormalizer();

        // Test Case 1: Valid input with spaces and lowercase publisher code
        String input1 = " pen2026004251 ";
        System.out.println("Input: \"" + input1 + "\"");
        String normalized1 = validator.normalizeCode(input1);
        System.out.println("Output: " + validator.validateAndFormat(normalized1));

        System.out.println();

        // Test Case 2: Invalid publisher code (contains digits)
        String input2 = "12N2026004251";
        System.out.println("Input: \"" + input2 + "\"");
        String normalized2 = validator.normalizeCode(input2);
        System.out.println("Output: " + validator.validateAndFormat(normalized2));
    }
}

}
