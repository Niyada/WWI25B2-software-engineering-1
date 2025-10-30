package zoo;

import animals.Animal;
import animals.Bird;
import animals.Dog;

public class Zoo {
    public static void main(String[] args) {
        int numberOfAnimals = 6;
        Animal[] allAnimals = new Animal[numberOfAnimals];

        allAnimals[0] = new Dog("Rex");
        allAnimals[1] = new Dog("Bella");
        allAnimals[5] = new Bird("Ralf");

         for (Animal currAnimal : allAnimals) {
            System.out.println("\nA new animal has arrived:");
            currAnimal.makeSound();
            currAnimal.eat();
            currAnimal.sleep();
        }
    }
}
