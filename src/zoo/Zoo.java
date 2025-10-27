package zoo;

import animals.Animal;
import animals.Dog;
import animals.Fox;
import animals.Sheep;

public class Zoo {
    public static void main(String[] args) {
        int numberOfAnimals = 4;
        Animal[] allAnimals = new Animal[numberOfAnimals];

        allAnimals[0] = new Dog("Rex");
        allAnimals[1] = new Dog("Bella");
        allAnimals[2] = new Fox("Peter");
        allAnimals[3] = new Sheep("Dolly");

         for (Animal currAnimal : allAnimals) {
            System.out.println("\nA new animal has arrived:");
            currAnimal.makeSound();
            currAnimal.eat();
            currAnimal.sleep();
        }
    }
}
