public class week1.4 {
    // Practice 3: Java Exceptions, Hierarchy, and Unchecked (RuntimeException) Exceptions
public class UncheckedExceptionsDemo {

    // Demonstrates ArithmeticException (division by zero)
    public void divideNumbers(int a, int b) {
        try {
            int answer = a / b;
            System.out.println("Result of " + a + " / " + b + " = " + answer);
        } catch (ArithmeticException e) {
            System.out.println("Handled Exception: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block: Division completed.\n");
        }
    }

    // Demonstrates ArrayIndexOutOfBoundsException
    public void getArrayElement(int index) {
        int[] scores = {85, 90, 95};
        try {
            int score = scores[index];
            System.out.println("Score at index " + index + ": " + score);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled Exception: Index " + index + " does not exist in array!\n");
        }
    }

    // Demonstrates NumberFormatException
    public void convertTextToNumber(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Handled Exception: \"" + text + "\" is not a valid number!\n");
        }
    }

    public static void main(String[] args) {
        UncheckedExceptionsDemo obj = new UncheckedExceptionsDemo();

        System.out.println("=== Unchecked (Runtime) Exceptions Demo ===\n");

        // 1. Division
        obj.divideNumbers(10, 2); // Normal
        obj.divideNumbers(10, 0); // Exception

        // 2. Array index
        obj.getArrayElement(5);   // Exception

        // 3. String to number
        obj.convertTextToNumber("100"); // Normal
        obj.convertTextToNumber("abc"); // Exception
    }
}

}
