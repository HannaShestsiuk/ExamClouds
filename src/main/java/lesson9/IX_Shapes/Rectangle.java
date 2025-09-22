package lesson9.IX_Shapes;

public class Rectangle extends Shape{
    private int x1, y1;
    private int x2, y2;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a " + color + " rectangle.");
    }
}