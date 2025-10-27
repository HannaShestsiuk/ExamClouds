package lesson19_collections.IX_Pets;

public class Parrot extends Pet{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Squawk!");
    }
}
