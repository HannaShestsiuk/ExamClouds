package lesson10_static.II_fruits;

public class Apple extends Fruit{
    static double appleCost = 0.0;
    double price = 4.5;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        double cost = getWeight() * price;
        appleCost += cost;
        return cost;
    }

    public static double getAppleCost() {
        return appleCost;
    }
}
