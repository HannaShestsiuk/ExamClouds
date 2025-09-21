package lesson9.VI_Cars;

import lesson9.VI_Cars.details.Engine;
import lesson9.VI_Cars.professions.Driver;
import lesson9.VI_Cars.vehicles.Car;
import lesson9.VI_Cars.vehicles.Lorry;
import lesson9.VI_Cars.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("James Bond", 20);
        Engine engine1 = new Engine(150, "Toyota");

        Car car = new Car("Toyota New", "First", 1300, driver1, engine1);
        System.out.println("This is Car Info");
        System.out.println(car);
        car.start();
        car.turnLeft();
        car.stop();

        System.out.println("\nThis is Lorry Info:");
        Driver driver2 = new Driver("John Smith", 15);
        Engine engine2 = new Engine(400, "BMW");
        Lorry lorry = new Lorry("Volvo 100", "Lorry", 8000, driver2, engine2, 25);
        System.out.println(lorry);

        System.out.println("\nThis is SportCar Info");
        Driver driver3 = new Driver("Adam Brooks", 5);
        Engine engine3 = new Engine(600, "Ferrari");
        SportCar sportCar = new SportCar("Ferrari 100", "sport car", 1200, driver3, engine3, 340);
        System.out.println(sportCar);
    }
}