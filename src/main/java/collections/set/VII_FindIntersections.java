/**
 * Пересечение множеств
 * Есть два Set<String>:
 * - тест-кейсы из спринта 1
 * - тест-кейсы, которые упали на регрессе.
 * Найди и выведи те, которые пересекаются.
 */
package collections.set;

import java.util.HashSet;
import java.util.Set;

public class VII_FindIntersections {
    public static void main(String[] arg){
        Set<String> sprintTestCases = new HashSet<>();
        sprintTestCases.add("TC01");
        sprintTestCases.add("TC03");
        sprintTestCases.add("TC04");
        sprintTestCases.add("TC10");
        sprintTestCases.add("TC11");

        Set<String> failedTestCases = new HashSet<>();
        failedTestCases.add("TC02");
        failedTestCases.add("TC04");
        failedTestCases.add("TC05");
        failedTestCases.add("TC10");

        Set<String> intersection = new HashSet<>(sprintTestCases);
        //retainAll() method removes all items from a list which do not belong to a specified collection
        intersection.retainAll(failedTestCases);

        System.out.println("Failed test cases within the Sprint:");
        for (String tc: intersection){
            System.out.println("- " + tc);
        }
    }
}
