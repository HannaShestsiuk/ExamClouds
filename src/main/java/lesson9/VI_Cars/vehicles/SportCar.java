package lesson9.VI_Cars.vehicles;

import lesson9.VI_Cars.details.Engine;
import lesson9.VI_Cars.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String make,
                    String carClass,
                    double weight,
                    Driver driver,
                    Engine engine,
                    double speed) {
        super(make, carClass, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nМаксимальная скорость: " + speed;
    }
}
