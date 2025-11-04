/**
 * 9. Отфильтруй по длине
 * Создай Set<String> имён.
 * Оставь только те, у которых длина больше 4 символов.
 */
package collections.set;

import java.util.HashSet;
import java.util.Set;

public class IX_LengthFilter {
    public static void main(String[] args) {
        Set<String> userNames = new HashSet<>();
        userNames.add("Alice");
        userNames.add("Bob");
        userNames.add("Charlie");
        userNames.add("Diana");
        userNames.add("Ryan");

        Set<String> namesLengthMoreThanMin = new HashSet<>(userNames);
        namesLengthMoreThanMin.removeIf(name -> name.length() < 5);

        System.out.println("List of names with length above 4");
        for (String name : namesLengthMoreThanMin){
            System.out.println("- " + name);
        }
    }
}
