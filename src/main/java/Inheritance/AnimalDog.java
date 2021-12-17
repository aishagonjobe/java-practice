package Inheritance;

public class AnimalDog extends Animal { // Subclass (child)
    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }
}