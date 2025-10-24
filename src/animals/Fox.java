package animals;

public class Fox extends Animal {
    public Fox(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Fox): What does the fox say?");
    }
}
