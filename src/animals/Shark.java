package animals;

public class Shark extends Animal{
    public Shark(String name) {super(name);}

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Shark): Blub blub Blub");
    }
}

