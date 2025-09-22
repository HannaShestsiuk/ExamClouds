package lesson9.IX_Shapes;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract void draw();
}