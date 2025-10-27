package lesson19_collections.II_TreeSet;

public class HeavyBox extends Box implements Comparable<HeavyBox>{
    int weight;

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "This is a heavy box with weight " + weight;
    }

    @Override
    public int compareTo(HeavyBox other) {
        return Integer.compare(this.weight, other.weight);
    }
}
