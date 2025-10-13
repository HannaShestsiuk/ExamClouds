package lesson19_collections.I_DynamicArray;

public class HeavyBox extends Box{
    int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

//    public int getWeight() {
//        return weight;
//    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "This Heavy Box contains something with weight " + weight;
    }
}
