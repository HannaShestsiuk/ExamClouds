package lesson19_collections.IX_Pets;

public class Cat extends Pet{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}
