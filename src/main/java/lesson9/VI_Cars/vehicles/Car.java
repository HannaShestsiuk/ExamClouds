package lesson9.VI_Cars.vehicles;

import lesson9.VI_Cars.details.Engine;
import lesson9.VI_Cars.professions.Driver;

public class Car {
    private String make;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String make, String carClass, double weight, Driver driver, Engine engine) {
        this.make = make;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("Break!");
    }

    public void turnRight() {
        System.out.println("Turn Right!");
    }

    public void turnLeft() {
        System.out.println("Turn Left!");
    }

    @Override
    public String toString() {
        return "Марка: " + make +
                ", класс: " + carClass +
                ", вес: " + weight + " " +
                driver + " " +
                engine;
    }
}
