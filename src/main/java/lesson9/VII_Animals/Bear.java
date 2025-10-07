package lesson9.VII_Animals;

public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " says: Gr-gr-gr!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats: raspberry");
    }

    @Override
    public String getDescription() {
        return getName() + " is huge.";
    }
}
