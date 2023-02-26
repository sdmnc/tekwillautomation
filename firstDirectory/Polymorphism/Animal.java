package firstDirectory.Polymorphism;

public class Animal {

    public void makeSound(){
        System.out.println("Makes sound");
    }

    public static void main(String []args) {
        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}

