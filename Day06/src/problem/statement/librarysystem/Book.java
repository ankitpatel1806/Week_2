package problem.statement.librarysystem;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability status
    }

    @Override
    public int getLoanDuration() {
        return 14; // Book loan duration is 14 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Reserving book: " + getTitle());
            isAvailable = false; // Book is no longer available after reserving
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
