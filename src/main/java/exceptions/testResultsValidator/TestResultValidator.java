/**
 * Простая валидация массива результатов тестов
 * Задача. Есть массив статусов:
 * String[] statuses = {"PASSED", "PASSED", "FAILED", "SKIPPED"};
 * Метод:
 * public static boolean validateTestStatuses(String[] statuses)
 * Требования:
 * Допустимые значения: PASSED, FAILED, SKIPPED.
 * Если элемент null или пуст — InvalidStatusException.
 * Если встречено значение вне списка — UnknownStatusException (например, XFAILED).
 * Если массив null или длина 0 — EmptySuiteException.
 * Обработка исключений внутри (multi-catch), вернуть true/false.
 * Примеры:
 * ["PASSED","FAILED"] → true
 * ["PASSED","BROKEN"] → false
 * [] → false
 */
package exceptions.testResultsValidator;

public class TestResultValidator {
    public static boolean validateTestStatuses(String[] statuses){
        try{
            if (statuses == null || statuses.length == 0) {
                throw new EmptySuiteException("Test suite is empty");
            }
            for (String status : statuses){
                if(status == null || status.isBlank()){
                    throw new InvalidStatusException("Status is null or empty");
                }
                switch (status){
                    case "PASSED", "FAILED", "SKIPPED" -> {}
                    default -> throw new UnknownStatusException("Unknown Status: " + status);
                }
            }
            return true;
        }
        catch(EmptySuiteException| UnknownStatusException | InvalidStatusException e) {
            System.out.println("Invalid Test Results: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String[] suite1 = {"PASSED", "FAILED"};
        String[] suite2 = {"PASSED", "BROKEN"};
        String[] suite3 = {};
        String[] suite4 = {"FAILED", " "};

        System.out.println(validateTestStatuses(suite1));
        System.out.println(validateTestStatuses(suite2));
        System.out.println(validateTestStatuses(suite3));
        System.out.println(validateTestStatuses(suite4));
    }
}
