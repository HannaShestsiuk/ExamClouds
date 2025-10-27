/**
 * Создать TreeSet
 * 1. Создать TreeSet содержащий объекты классы HeavyBox.
 * 2. Класс HeavyBox наследует класс Box и содержит переменную - int weight.
 * 3. Класс Box содержит переменные double width, double height, double depth.
 * 4. HeavyBox должен реализовать интерфейс Comparable, сортировка должна осуществляться по переменной weight.
 * 5. Распечатать содержимое с помощью for each.
 */
package lesson19_collections.II_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet containing HeavyBox objects
        Set<HeavyBox> boxSet = new TreeSet<>();

        // Add heavy box objects => They will be auto-sorted
        boxSet.add(new HeavyBox(10, 20, 30, 40));
        boxSet.add(new HeavyBox(30, 40, 50, 60));
        boxSet.add(new HeavyBox(20, 30, 40, 50));

        // Print with for-each loop
        System.out.println("Sorted by weight list of heavy boxes:");
        for (HeavyBox box : boxSet) {
            System.out.println(box);
        }
    }
}
