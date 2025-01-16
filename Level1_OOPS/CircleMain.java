import java.util.Scanner;
class Circle{
	double radius;
	// Constructor to initialize the attributes
	public Circle(double radius){
		this.radius = radius;
	}
	//method to calculate area of circle
	public double areaofCircle(){
		return Math.PI * radius * radius;
	}
	//Method th calculate circumfarence
	public double circumfrenceofCircle(){
		return 2 * Math.PI * radius;
	}
	//Display function
	 public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + areaofCircle());
        System.out.println("Circumference of the circle: " + circumfrenceofCircle());
    }
}
public class CircleMain{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		// Take input radius
		System.out.print("Enter Radius of circle : ");
		double radius = scanner.nextDouble();
		//object of circle class
		Circle circle = new Circle(radius);
		//Display function
		circle.displayDetails();
		scanner.close();
		
	}
}
