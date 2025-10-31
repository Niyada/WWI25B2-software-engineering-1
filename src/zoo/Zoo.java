package zoo;

import animals.*;

public class Zoo {
    public static void main(String[] args) {
        int numberOfAnimals = 8;
        Animal[] allAnimals = new Animal[numberOfAnimals];

        allAnimals[0] = new Dog("Rex");
        allAnimals[1] = new Dog("Bella");
        allAnimals[2] = new Fox("Peter");
        allAnimals[3] = new Sheep("Dolly");
        allAnimals[4] = new Shark("Horst");
        allAnimals[5] = new Bird("Ralf");
        allAnimals[6] = new Cat("Klaus");
        allAnimals[7] = new Duck("Daisy");

         for (Animal currAnimal : allAnimals) {
            System.out.println("\nA new animal has arrived:");
            currAnimal.makeSound();
            currAnimal.eat();
            currAnimal.sleep();
        }
    }
}
