package problem.assisted.animalhierarchy;


public class AnimalHierarchy {
        public static void main(String[] args) {
            Animal dog = new Dog("Rainbow", 5);
            Animal cat = new Cat("Laila", 3);
            Animal bird = new Bird("Mithu", 2);

            dog.makeSound();
            cat.makeSound();
            bird.makeSound();
        }
    }

