package problem.statement.librarysystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each library item
        LibraryItem book = new Book("B001", "Harry Potter", "J.K. Rowling");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "The Matrix", "Wachowski Brothers");

        // Using polymorphism to manage items in the library
        LibraryItem[] items = {book, magazine, dvd};

        // Displaying item details and loan duration
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + ", Loan Duration: " + item.getLoanDuration() + " days");
        }

        // Reserving and checking availability
        System.out.println("\nAttempting to reserve items...\n");

        // Polymorphism with Reservable interface
        if (book instanceof Reservable) {
            Reservable reservableBook = (Reservable) book;
            if (reservableBook.checkAvailability()) {
                reservableBook.reserveItem();
            }
        }

        if (magazine instanceof Reservable) {
            Reservable reservableMagazine = (Reservable) magazine;
            if (reservableMagazine.checkAvailability()) {
                reservableMagazine.reserveItem();
            }
        }

        if (dvd instanceof Reservable) {
            Reservable reservableDVD = (Reservable) dvd;
            if (reservableDVD.checkAvailability()) {
                reservableDVD.reserveItem();
            }
        }
    }
}
