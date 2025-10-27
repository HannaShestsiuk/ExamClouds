package lesson19_collections.V_queue;

public class HeavyBox extends Box{
    int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Heavy box with weight = " + weight;
    }
}
