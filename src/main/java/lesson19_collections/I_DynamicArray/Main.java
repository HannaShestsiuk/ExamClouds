/**
 * Создать динамический массив
 * 1. Создать динамический массив, содержащий объекты класса HeavyBox.
 * 2. Класс HeavyBox наследует класс Box и содержит переменную - int weight.
 * 3. Класс Box содержит переменные double width, double height, double depth.
 * 4. Распечатать его содержимое используя for each.
 * 5. Изменить вес первого ящика на 1.
 * 6. Удалить последний ящик.
 * 7. Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * 8. Удалить все ящики.
 */
package lesson19_collections.I_DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a dynamic array (ArrayList) of HeavyBox objects
        ArrayList<HeavyBox> heavyBoxList = new ArrayList<>();
        heavyBoxList.add(new HeavyBox(10, 5, 5, 20));
        heavyBoxList.add(new HeavyBox(10, 10, 5, 30));
        heavyBoxList.add(new HeavyBox(15, 10, 10, 40));

        // Print its contents using a for-each
        System.out.println("Heavy boxes list:");
        for(HeavyBox box : heavyBoxList){
            System.out.println(box);
        }

        // Change the weight of the first box to 1
        heavyBoxList.getFirst().setWeight(1);

        // Remove the last box in the list
        heavyBoxList.removeLast();

        // Get an array from the collection in three ways

        System.out.println("\nJust print Heavy Box list: \n" + heavyBoxList);

        // Method 1: Using toArray(T[] a) with an empty array
        HeavyBox[] array1 = heavyBoxList.toArray(new HeavyBox[0]);
        System.out.println("\nMethod 1 - toArray with empty array: \n"
                + Arrays.toString(array1));

        // Method 2: Using toArray(T[] a) with pre-sized array
        HeavyBox[] array2 = heavyBoxList.toArray(new HeavyBox[heavyBoxList.size()]);
        System.out.println("\nMethod 2 - toArray with sized array: \n"
                + Arrays.toString(array2));

        // Method 2: Using toArray() and a type Object
        Object[] array3 = heavyBoxList.toArray();
        System.out.println("\nMethod 3 - toArray with Object Type: \n"
                + Arrays.toString(array3));

        // Remove all boxes
        heavyBoxList.clear();
        System.out.println("\nList after removing all boxes: " + heavyBoxList);
    }
}
