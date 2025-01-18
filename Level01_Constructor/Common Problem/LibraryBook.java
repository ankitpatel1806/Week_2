import java.util.Scanner;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    public void borrow() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed " + title + ".");
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Main function to demonstrate the LibraryBook class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for book details
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        System.out.print("Is the book available? (true/false): ");
        boolean availability = scanner.nextBoolean();

        // Creating the LibraryBook object
        LibraryBook book = new LibraryBook(title, author, price, availability);

        // Borrowing the book
        book.borrow();

        scanner.close();
    }
}
