import java.util.Scanner;
class Book {
    // Attributes
    String name;
    String author;
    double price;
    // Constructor to initialize the attributes
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    // Method to display Book details
    public void displayDetails() {
        System.out.println("Book's Name: " + name);
        System.out.println("Author Name: " + author);
        System.out.println("Price Name: " + price);
    }
}
public class BookMain {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Take input for book details
        System.out.print("Enter Book name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Price of Book: ");
        double price = scanner.nextDouble();
        // Create an Book object
        Book book = new Book(name, author, price);
        // Display the details
        book.displayDetails();
        // Close the scanner
        scanner.close();
    }
}
