public class week1.3 {
    import java.util.Scanner;

// Practice 1: Java Strings, Creation, Escape Sequences, Input, Built-In Methods
public class StringBasics {

    // Method to create strings and show escape sequences
    public void showStringsAndEscapeSequences() {
        // 1. Different ways to create Strings
        String str1 = "Hello World";
        String str2 = new String("Java Programming");
        char[] letters = {'S', 'R', 'M'};
        String str3 = new String(letters);

        System.out.println("String 1 (Literal): " + str1);
        System.out.println("String 2 (new keyword): " + str2);
        System.out.println("String 3 (char array): " + str3);

        // 2. Escape sequences: \n, \t, \", \\
        String escapeDemo = "Hello\n\t\"Java\"\nPath: C:\\Desktop";
        System.out.println("\nEscape sequence demo:");
        System.out.println(escapeDemo);
    }

    // Method taking string as parameter and using built-in methods
    public void showStringMethods(String text) {
        // Built-in methods
        int textLength = text.length();
        String upperText = text.toUpperCase();
        String lowerText = text.toLowerCase();
        char firstLetter = text.charAt(0);
        boolean containsWord = text.contains("Java");

        // Display results
        System.out.println("\n--- Built-In Methods Results ---");
        System.out.println("Original: " + text);
        System.out.println("Length: " + textLength);
        System.out.println("Uppercase: " + upperText);
        System.out.println("Lowercase: " + lowerText);
        System.out.println("First character: " + firstLetter);
        System.out.println("Contains 'Java': " + containsWord);
    }

    public static void main(String[] args) {
        StringBasics obj = new StringBasics();

        // Calling method to show string creation
        obj.showStringsAndEscapeSequences();

        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a sentence: ");
        String userInput = sc.nextLine();

        // Passing string to method as parameter
        obj.showStringMethods(userInput);

        sc.close();
    }
}

}
