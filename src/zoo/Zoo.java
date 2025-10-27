package zoo;

import animals.Animal;
import animals.Dog;
import animals.Fox;
import animals.Sheep;
import animals.Shark;

public class Zoo {
    public static void main(String[] args) {
        int numberOfAnimals = 5;
        Animal[] allAnimals = new Animal[numberOfAnimals];

        allAnimals[0] = new Dog("Rex");
        allAnimals[1] = new Dog("Bella");
        allAnimals[2] = new Fox("Peter");
        allAnimals[3] = new Sheep("Dolly");
        allAnimals[4] = new Shark("Horst");

         for (Animal currAnimal : allAnimals) {
            System.out.println("\nA new animal has arrived:");
            currAnimal.makeSound();
            currAnimal.eat();
            currAnimal.sleep();
        }
    }
}
