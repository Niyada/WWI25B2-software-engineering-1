package animals;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Lion): roaring roaring roaring!");
    }
    @Override
    public void eat() {
        System.out.println(this.getName() + " (Lion): is eating!");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " (Lion): is sleeping!");
    }

}