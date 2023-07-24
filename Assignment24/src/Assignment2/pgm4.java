package Assignment2;

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class pgm4 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Prints "Woof!"
        // This will not compile because the abstract class Animal
        // cannot be instantiated directly.
        // Animal animal2 = new Animal();
    }

}