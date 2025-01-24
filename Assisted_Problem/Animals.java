class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Always be Woof Woof");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Say Meow Meow");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " Say Chirp Chirp");
    }
}
public class Animals {
    public static void main(String[] args) {
        Animal dog = new Dog("Rainbow", 5);
        Animal cat = new Cat("Laila", 3);
        Animal bird = new Bird("Mithu", 2);
        dog.makeSound(); 
        cat.makeSound(); 
        bird.makeSound(); 
    }
}
