public class Book {
    // Static variable shared across all books
    private static String libraryName = "The Anime Library";
    
    // Final variable to ensure ISBN cannot be changed once assigned
    private final String isbn;
    
    // Instance variables
    private String title;
    private String author;
    
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = generateIsbn();  // Unique ISBN for each book
    }
    
    // Method to generate a unique ISBN (for demonstration)
    private String generateIsbn() {
        return "ISBN" + (1000 + Math.random() * 9999);
    }
    
    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("One Piece", "Eiichiro Oda ");
        Book book2 = new Book("Attack on Titan", "Hajime Isayama");
        
        // Display library name
        Book.displayLibraryName();
        
        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        
        // Verify object instance
        if (book1 instanceof Book) {
            System.out.println("book1 is an instance of Book.");
        }
    }
}
