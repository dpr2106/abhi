public class week22.2 {
    // Problem 2: Word Reversal Encoder
// Concepts: split(), StringBuilder / reverse(), loops, string joining

public class Problem2_WordReversalEncoder {

    // Method to reverse each word individually in a sentence
    public String reverseEachWord(String sentence) {
        // Split sentence into words by space
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // Reverse current word using StringBuilder
            StringBuilder wordBuilder = new StringBuilder(words[i]);
            wordBuilder.reverse();

            // Append reversed word to result
            result.append(wordBuilder);

            // Add space between words (except after the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Problem2_WordReversalEncoder encoder = new Problem2_WordReversalEncoder();

        String input = "hello club";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + encoder.reverseEachWord(input));
    }
}

}
