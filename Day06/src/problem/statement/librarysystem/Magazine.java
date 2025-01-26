package problem.statement.librarysystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability status
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazine loan duration is 7 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Reserving magazine: " + getTitle());
            isAvailable = false; // Magazine is no longer available after reserving
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
