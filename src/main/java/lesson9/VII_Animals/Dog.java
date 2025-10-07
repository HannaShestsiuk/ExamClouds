package lesson9.VII_Animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " says: Woof-woof!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats: meat");
    }

    @Override
    public String getDescription() {
        return getName() + " is the best friend";
    }
}
