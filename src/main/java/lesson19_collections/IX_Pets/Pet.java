package lesson19_collections.IX_Pets;

abstract class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void makeNoise();
}
