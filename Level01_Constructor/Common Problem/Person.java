import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main function to demonstrate the Person class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for person details
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Creating the Person object
        Person person1 = new Person(name, age);

        // Creating a copy of the person
        Person person2 = new Person(person1);  // Using the copy constructor

        System.out.println("\nPerson 1 Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        System.out.println("\nPerson 2 (Copy) Details:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        
        scanner.close();
    }
}
