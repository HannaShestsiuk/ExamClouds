package lesson9.IX_Shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Blue"),
                new Rectangle("Yellow"),
                new Circle("Red"),
                new Rectangle("Green")
        };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}