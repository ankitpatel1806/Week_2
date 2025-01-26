package problem.statement.librarysystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Default availability status
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVD loan duration is 3 days
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Reserving DVD: " + getTitle());
            isAvailable = false; // DVD is no longer available after reserving
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
