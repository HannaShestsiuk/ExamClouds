package lesson9.VI_Cars.details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "\nMощность = " + power +
                " , производитель = " + company;
    }
}
