/**
 * Разделение коллекции
 * 1. Создать коллекцию, содержащую объекты класса Box.
 *      public class Box {
 *          private double width;
 *          private double height;
 *          private double depth;
 * 2. Написать метод, который перебирает элементы коллекции и проверяет ширину коробок.
 * 3. Если ширина коробки больше 30 см, коробка перемещается в другую коллекцию.
 * 4. Для перебора элементов, используем итератор.
 */
package lesson19_collections.VI_CollectionsWithIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a collection with boxes
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(10, 20, 30));
        boxes.add(new Box(30, 30, 40));
        boxes.add(new Box(31, 40, 50));
        boxes.add(new Box(40, 50, 60));

        // Create a collection for boxes with width > 30
        List<Box> bigBoxes = new ArrayList<>();

        // Use iterator to check boxes' width
        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30){
                // Put the box to the new collection
                bigBoxes.add(box);
                // Remove the box from the old collection
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("Small boxes:");
        for (Box box : boxes){
            System.out.println(box);
        }

        System.out.println();
        System.out.println("Big boxes:");
        for (Box box : bigBoxes){
            System.out.println(box);
        }
    }
}
