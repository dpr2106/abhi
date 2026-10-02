public class week24.5 {
    import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

// Problem 5: Stop-Word-Filtered Word Frequency Report
// Concepts: replace(), split() with whitespace pattern, stop-word filtering, frequency counting, sorting

public class Problem5_WordFrequencyReport {

    // Method to filter stop words and print word frequencies sorted descending
    public void printFilteredWordFrequency(String feedback) {
        // Fixed list of stop words to exclude
        List<String> stopWords = Arrays.asList("the", "was", "and", "a", "is", "of", "in");

        // Normalize text: convert to lowercase and remove punctuation (period and comma)
        String cleanedText = feedback.toLowerCase();
        cleanedText = cleanedText.replace(".", "");
        cleanedText = cleanedText.replace(",", "");

        // Split text by whitespace into words
        String[] words = cleanedText.split("\\s+");

        // Count frequency of non-stop words using HashMap
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].trim();

            // Skip if word is empty or is a stop word
            if (word.isEmpty() || stopWords.contains(word)) {
                continue;
            }

            // Update frequency count
            int currentCount = frequencyMap.getOrDefault(word, 0);
            frequencyMap.put(word, currentCount + 1);
        }

        // Sort entries by count in descending order
        ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print word frequencies
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Problem5_WordFrequencyReport reporter = new Problem5_WordFrequencyReport();

        String input = "The mentor was great, the session was great and clear.";
        System.out.println("Input: \"" + input + "\"\n");
        System.out.println("Output:");
        reporter.printFilteredWordFrequency(input);
    }
}

}
