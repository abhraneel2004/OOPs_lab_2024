class Animal {
    Animal(){
        System.out.println("An animal is created.");
	}
    void sound(){
        System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("A dog is created.");
    }
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    Puppy() {
        super(); // Calls the constructor of the superclass (Dog)
        System.out.println("A puppy is created.");
    }
    @Override
    void sound(){
        System.out.println("Puppy yaps");
	}
    void behavior(){
        System.out.println("Puppy is playful");
	}
}
public class Test4 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog dog = new Dog();
        dog.sound();
        System.out.println("\nMultilevel Inheritance:");
        Puppy puppy = new Puppy();
        puppy.sound();  
        puppy.behavior();
        System.out.println("\nUsing 'super' keyword:");
        Dog anotherDog = new Dog() {
            @Override
            void sound() {
                super.sound();
                System.out.println("Another dog barks differently");
            }
        };
        anotherDog.sound();
    }
}