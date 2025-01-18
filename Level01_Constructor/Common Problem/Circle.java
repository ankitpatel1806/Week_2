import java.util.Scanner;
class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(5.0); // Constructor chaining to set a default radius of 1.0
    }
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }
    // Main function to demonstrate the Circle class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for circle radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating the Circle object
        Circle circle1 = new Circle(radius);

        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + circle1.getRadius());
        
        scanner.close();
    }
}
