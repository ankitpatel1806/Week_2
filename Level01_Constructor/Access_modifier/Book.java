// Book class
class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// EBook class demonstrating access modifiers
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);  
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("12345", "Java", "Ankit");
        ebook.displayDetails();
    }
}
