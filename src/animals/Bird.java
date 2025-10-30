package animals;

public class Bird extends Animal {
    public Bird(String name) {super(name);}

    public void makeSound() {System.out.println(this.getName() + " (Bird): Piep Piep!");}
}
