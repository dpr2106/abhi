/ Practice 2: String Arrays, String Parameters, and ASCII Character Codes
public class StringArrayAndAscii {

    // Method taking string array as parameter
    public void printStudents(String[] names) {
        System.out.println("--- Student Array List ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + names[i]);
        }
    }

    // Method to search a name in string array
    public void searchStudent(String[] names, String targetName) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(targetName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nResult: " + targetName + " was found in the array!");
        } else {
            System.out.println("\nResult: " + targetName + " was not found.");
        }
    }

    // Method demonstrating ASCII character codes
    public void showAsciiCodes(String word) {
        System.out.println("\n--- ASCII Character Codes for \"" + word + "\" ---");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int asciiCode = (int) ch; // Casting char to int gives ASCII code
            System.out.println("Character: '" + ch + "' -> ASCII Code: " + asciiCode);
        }
    }

    public static void main(String[] args) {
        StringArrayAndAscii obj = new StringArrayAndAscii();

        // String array
        String[] studentList = {"Prashanth", "Rahul", "Sneha", "Ananya"};

        // 1. Pass array to method
        obj.printStudents(studentList);

        // 2. Search in array
        obj.searchStudent(studentList, "Sneha");

        // 3. Show ASCII codes
        obj.showAsciiCodes("Java");
    }
}