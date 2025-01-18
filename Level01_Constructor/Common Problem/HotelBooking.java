import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Getter methods
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Main function to demonstrate the HotelBooking system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for hotel booking details
        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();
        System.out.print("Enter room type (e.g., Deluxe, Standard): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        // Creating the HotelBooking object
        HotelBooking booking1 = new HotelBooking(guestName, roomType, nights);

        // Printing the details of the booking
        System.out.println("\nHotel Booking Details:");
        System.out.println("Guest Name: " + booking1.getGuestName());
        System.out.println("Room Type: " + booking1.getRoomType());
        System.out.println("Nights: " + booking1.getNights());

        // Creating a copy of the booking
        HotelBooking booking2 = new HotelBooking(booking1);
        System.out.println("\nCopied Booking Details:");
        System.out.println("Guest Name: " + booking2.getGuestName());
        System.out.println("Room Type: " + booking2.getRoomType());
        System.out.println("Nights: " + booking2.getNights());
        
        scanner.close();
    }
}
