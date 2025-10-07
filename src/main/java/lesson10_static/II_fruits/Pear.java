package lesson10_static.II_fruits;

public class Pear extends Fruit{
    static double pearCost = 0.0;
    double price = 3.5;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        double cost = getWeight() * price;
        pearCost += cost;
        return cost;
    }

    public static double getPearCost() {
        return pearCost;
    }
}
