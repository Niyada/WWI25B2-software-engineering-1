package animals;

public class Duck extends Animal {
     public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " (Duck): Quack Quack!");
    }
}
