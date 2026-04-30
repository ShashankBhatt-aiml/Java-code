class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog();

        // Access the inherited method from Animal
        myDog.eat();

        // Access the method defined in Dog
        myDog.bark();
    }
}
