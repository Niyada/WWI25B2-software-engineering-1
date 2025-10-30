package animals;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Lion): roaring roaring roaring!");
    }
}