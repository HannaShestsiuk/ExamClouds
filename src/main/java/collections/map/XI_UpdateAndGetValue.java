/**
 * 11. Подсчёт количества тестов на каждого разработчика
 * Есть Map<String, Integer> — разработчик → количество тестов.
 * Увеличь значение на 1 для "John" и выведи итоговую карту.
 */
package collections.map;

import java.util.HashMap;
import java.util.Map;

public class XI_UpdateAndGetValue {
    public static void main(String[] args) {
        Map<String, Integer> testsByDev = new HashMap<String, Integer>();
        testsByDev.put("Alice", 10);
        testsByDev.put("Bob", 5);
        testsByDev.put("Charlie", 8);
        testsByDev.put("John", 15);

        String targetDeveloper = "John";

        testsByDev.computeIfPresent(targetDeveloper, (key, value) -> value + 1);

        System.out.println(targetDeveloper + " has written " + testsByDev.get(targetDeveloper) + " tests.");
    }
}
