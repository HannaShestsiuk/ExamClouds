package lesson9.IX_Shapes;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a " + color + " circle");;
    }
}