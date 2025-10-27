/**
 * Набор чисел
 * 1. Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5, 10,11".
 * 2. Избавиться от повторяющихся элементов в строке.
 * 3. Вывести результат на экран.
 * 4. Используем интерфейс Set.
 */

package lesson19_collections.III_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberSet {
    public static void main(String[] args) {
        String input = "1, 2, 3, 4, 4, 5, 10, 11";

        // Split the string by comma&space
        String[] numberStrings = input.split(",");

        // Create a Set to store unique numbers
        Set<Integer> numberSet = new LinkedHashSet<>();

        // Add each number to the Set
        for (String numStr : numberStrings) {
            // Parse each string element to an integer
            numberSet.add(Integer.parseInt(numStr.trim()));
        }

        // Print the result
        System.out.println("Set of Unique Numbers:");
        for (int number : numberSet) {
            System.out.print(number + " ");
        }
    }
}
