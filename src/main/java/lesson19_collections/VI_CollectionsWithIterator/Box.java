package lesson19_collections.VI_CollectionsWithIterator;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this. depth = depth;
    }

    public double getWidth(){
        return width;
    }

    public String toString(){
        return "Box with width " + width;
    }
}
