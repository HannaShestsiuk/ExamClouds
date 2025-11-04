/**
 * 14. Хранение результатов тестов
 * Нужно хранить результаты выполнения тестов в виде чисел (1 — passed, 0 — failed).
 * Количество заранее неизвестно, но порядок важен.
 * Выбери подходящую структуру (Array, Map или ArrayList) и реализуй:
 * добавление результатов,
 * подсчёт количества успешных.
 */
package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class XIV_AddAndCountByCondition {
    public static void main(String[] args) {
        // ArrayList<Integer> - Resizable array that maintains order
        List<Integer> testResults = new ArrayList<>();

        addTestResult(testResults, 1);
        addTestResult(testResults, 0);
        addTestResult(testResults, 1);
        addTestResult(testResults, 1);
        addTestResult(testResults, 0);

        System.out.println("All Test results: " + testResults);

        int passedCount = countSuccessfulTests(testResults);

        System.out.println("Amount of passed tests: " + passedCount);
    }

    public static void addTestResult(List<Integer> results, int result) {
        if (result == 1 || result == 0) {
            results.add(result);
        } else {
            System.err.println("Invalid Value: " + result);
        }
    }

    public static int countSuccessfulTests(List<Integer> results) {
        int count = 0;

        for (int result : results) {
            if (result == 1) {
                count++;
            }
        }

        return count;
    }
}
