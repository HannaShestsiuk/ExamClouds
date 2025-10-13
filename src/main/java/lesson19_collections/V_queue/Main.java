/**
 * Создать очередь
 * 1. Создать очередь, содержащую объекты класса HeavyBox.
 * 2. Класс HeavyBox наследует класс Box и содержит переменную - int weight.
 * 3. Класс Box содержит переменные double width, double height, double depth.
 * 4. Используем класс ArrayDeque.
 * 5. Поместить объекты в очередь с помощью метода offer().
 * 6. Удалить объекты методом poll().
 */
package lesson19_collections.V_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(1, 2,3,4);
        HeavyBox heavyBox2 = new HeavyBox(3, 4, 5, 6);
        HeavyBox heavyBox3 = new HeavyBox(5,6,7,8);

        Deque<HeavyBox> deque = new ArrayDeque<HeavyBox>();
        deque.offer(heavyBox1);
        deque.offer(heavyBox2);
        deque.offer(heavyBox3);

        System.out.println("Queue with heavy boxes: \n" + deque);
        System.out.println();

        HeavyBox heavyBox;
        while ((heavyBox = deque.poll()) != null) {
            System.out.println(heavyBox);
        }

        System.out.println("\nQueue is empty: \n" + deque);
    }
}
