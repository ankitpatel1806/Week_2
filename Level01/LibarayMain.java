import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}

public class LibarayMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("One Piece", "Oda");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();  // Displays books in the library
    }
}
