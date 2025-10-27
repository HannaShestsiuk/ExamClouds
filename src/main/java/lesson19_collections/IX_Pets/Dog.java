package lesson19_collections.IX_Pets;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
