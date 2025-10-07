package lesson10_static.II_fruits;

public class Apricot extends Fruit{
    static double apricotCost = 0.0;
    double price = 5.0;

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double getCost() {
        double cost = getWeight() * price;
        apricotCost += cost;
        return cost;
    }

    public static  double getApricotCost() {
        return apricotCost;
    }
}
