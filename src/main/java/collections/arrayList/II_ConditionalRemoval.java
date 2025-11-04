/**
 * Удаление по условию
 * Создай ArrayList<Integer> с числами.
 * Удаляй все элементы меньше 10. Выведи итоговый список.
 */
package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class II_ConditionalRemoval {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 11, 8, 18, 5, 100, 10));
        int boundaryValue = 10;
        System.out.println("Initial numbers list: " + numbers);
        removeLessThanBoundary(numbers, boundaryValue);
        System.out.println("Numbers after removal: " + numbers);
    }

    static void removeLessThanBoundary(List<Integer> list, int boundaryValue){
        list.removeIf(number -> number < boundaryValue);
    }
}