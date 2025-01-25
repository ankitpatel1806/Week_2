package problem.assisted.animalhierarchy;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " always says Woof Woof");
    }
}