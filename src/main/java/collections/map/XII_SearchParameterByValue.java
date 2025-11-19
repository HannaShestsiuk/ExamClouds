/**
 * 12. Отображение статусов тестов
 * Создай Map<String, String>:
 * testCaseId → status (например: "TC01" → "PASSED").
 * Выведи только те, у которых статус "FAILED".
 */
package collections.map;

import java.util.HashMap;
import java.util.Map;

public class XII_SearchParameterByValue {
    public static void main(String[] args) {
        Map<String, String> testCaseStatuses = new HashMap<String, String>();
        testCaseStatuses.put("TC01", "PASSED");
        testCaseStatuses.put("TC02", "FAILED");
        testCaseStatuses.put("TC03", "PASSED");
        testCaseStatuses.put("TC04", "FAILED");
        testCaseStatuses.put("TC05", "PASSED");

        System.out.println("Failed test cases:");
        for (String testCase : testCaseStatuses.keySet()){
            if (testCaseStatuses.get(testCase).equals("FAILED")){
                System.out.println(testCase);
            }
        }
    }
}
