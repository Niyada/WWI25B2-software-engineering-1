package animals;

public class Sheep extends Animal {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Sheep): Määäääh");
    }
}
