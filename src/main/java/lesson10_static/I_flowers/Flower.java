package lesson10_static.I_flowers;

public class Flower {
    String country;
    int expDate;
    double cost;
    static int soldCount = 0;

    public Flower(double cost) {
        this.cost = cost;
        soldCount++;
    }

    public static int getSoldCount() {
        return soldCount;
    }
}
