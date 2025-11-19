/**
 * 15. Сопоставление багов и приоритетов
 * Нужно хранить баги и их приоритеты:
 * "BUG-101" → "HIGH", "BUG-102" → "LOW", "BUG-103" → "MEDIUM".
 * Выбери подходящую структуру (ArrayList, Array или Map) и реализуй поиск по ID бага.
 * Выведи приоритет по введённому пользователем коду бага.
 */
package collections.map;

import java.util.HashMap;
import java.util.Map;

public class XV_SearchById {
    public static void main(String[] args) {
        // HashMap<>() stores key/value pairs with no specific order
        Map<String, String> bugPriorities = new HashMap<>();

        bugPriorities.put("BUG-101", "HIGH");
        bugPriorities.put("BUG-102", "LOW");
        bugPriorities.put("BUG-103", "MEDIUM");
        bugPriorities.put("BUG-104", "CRITICAL");

        String bugIdToSearch = "BUG-101";

        String priority = bugPriorities.get(bugIdToSearch);

        System.out.println("Search priority for BugId: " + bugIdToSearch);

        if (priority != null) {
            System.out.println("Priority: " + priority);
        } else {
            System.out.println("Not Found");
        }
    }
}
