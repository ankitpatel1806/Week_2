import java.util.Scanner;
class MovieTicket {
    // Attributes of the movie ticket
    String movieName;
    String seatNumber;
    double price;
    // Constructor to initialize ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for seat: " + seatNumber);
    }
    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
public class MovieTicketMain {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        // Taking movie details
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();
        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, "", 0.0);
        // Taking seat number and price input
        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();
        // Booking the ticket
        ticket.bookTicket(seatNumber, price);
        // Displaying ticket details
        ticket.displayTicketDetails();
        // Close the scanner
        scanner.close();
    }
}
