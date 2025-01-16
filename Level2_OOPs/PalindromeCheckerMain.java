import java.util.Scanner;
class PalindromeChecker {
    // Attribute to store the text
    String text;
    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }
    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversedText);
    }
    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
}
public class PalindromeCheckerMain {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for text
        System.out.print("Enter text to check palindrome: ");
        String text = scanner.nextLine();

        // Creating PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Displaying the result
        checker.displayResult();

        // Close the scanner
        scanner.close();
    }
}
