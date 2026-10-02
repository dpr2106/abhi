public class week22.1 {
    // Problem 1: ATM PIN Length Validator
// Concepts: length(), if/else, comparison operators

public class Problem1_AtmPinValidator {

    // Method to check if PIN is exactly 4 digits
    public void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN - must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        Problem1_AtmPinValidator validator = new Problem1_AtmPinValidator();

        // Test Case 1: 3 digits
        String pin1 = "482";
        System.out.println("Input: \"" + pin1 + "\"");
        System.out.print("Output: ");
        validator.checkPinLength(pin1);

        System.out.println();

        // Test Case 2: 4 digits
        String pin2 = "4820";
        System.out.println("Input: \"" + pin2 + "\"");
        System.out.print("Output: ");
        validator.checkPinLength(pin2);
    }
}

}
