package lesson10_static.II_fruits;

public abstract class Fruit {
    double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void printManufacturerInfo(){
        System.out.print("Made in Ukraine");
    }

    public abstract double getCost();
}
