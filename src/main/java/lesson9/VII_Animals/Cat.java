package lesson9.VII_Animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " says: Meow-meow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats: mice");
    }

    @Override
    public String getDescription() {
        return getName() + " is fluffy.";
    }
}
