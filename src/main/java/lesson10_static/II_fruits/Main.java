/**
 * Фруктовая лавка
 * 1. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * 2. Класс Фрукт содержит:
 * а) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 * в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
 * 3. Создать несколько объектов разных классов.
 * 4. Подсчитать общую стоимость проданных фруктов.
 * 5. А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

package lesson10_static.II_fruits;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create different classes's objects
        Apple apple1 = new Apple(0.3);
        Apple apple2 = new Apple(0.5);
        Pear pear1 = new Pear(0.2);
        Pear pear2 = new Pear(0.3);
        Apricot apricot1 = new Apricot(0.15);
        Apricot apricot2 = new Apricot(0.2);

        // Create fruits list
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple1);
        fruits.add(apple2);
        fruits.add(pear1);
        fruits.add(pear2);
        fruits.add(apricot1);
        fruits.add(apricot2);

        // count total cost of fruits
        double totalCost = 0;
        for (Fruit fruit : fruits) {
            totalCost += fruit.getCost();
        }

        System.out.println("Total fruit cost: " + String.format("%.2f", totalCost));
        System.out.println("Total apple cost: " + String.format("%.2f", Apple.getAppleCost()));
        System.out.println("Total pear cost: " + String.format("%.2f", Pear.getPearCost()));
        System.out.println("Total apricot cost: " + String.format("%.2f", Apricot.getApricotCost()));
    }
}
