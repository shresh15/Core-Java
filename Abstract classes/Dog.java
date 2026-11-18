
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

public class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();
        a.sleep();
    }
}