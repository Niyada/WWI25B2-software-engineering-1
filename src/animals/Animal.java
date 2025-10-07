package animals;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(this.name + " (" + this.getClass().getName() + "): is eating.");
    }

    public void sleep() {
        System.out.println(this.name + " (" + this.getClass().getName() + "): is sleeping.");
    }

    public String getName() {
		return this.name;
	}
}
