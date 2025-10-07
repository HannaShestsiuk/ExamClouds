package lesson9.VI_Cars.vehicles;

import lesson9.VI_Cars.details.Engine;
import lesson9.VI_Cars.professions.Driver;

public class Lorry extends Car {
    private double carrying;

    public Lorry(String make,
                 String carClass,
                 double weight,
                 Driver driver,
                 Engine engine,
                 double carrying) {
        super(make, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + carrying;
    }
}
