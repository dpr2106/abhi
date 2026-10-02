public class week2.1 {
    // Problem 1: Vowel & Consonant Counter
// Concepts: charAt(), length(), loops, case-insensitive comparison

public class Problem1_VowelConsonantCounter {

    // Method to count vowels and consonants ignoring spaces
    public void countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert string to lowercase for easy comparison
        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } 
            // If it is a letter and not a space, count as consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }

        // Print output in the requested format
        System.out.println("Vowels: " + vowelsCount + " | Consonants: " + consonantsCount);
    }

    public static void main(String[] args) {
        Problem1_VowelConsonantCounter counter = new Problem1_VowelConsonantCounter();

        String input = "Java Programming";
        System.out.println("Input: \"" + input + "\"");
        System.out.print("Output: ");
        counter.countVowelsAndConsonants(input);
    }
}

}
