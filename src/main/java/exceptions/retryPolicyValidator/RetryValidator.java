/**
 *Проверка параметров стратегии ретраев
 * Задача. Метод:
 * public static boolean validateRetryPolicy(int retries, long delayMs, boolean exponential)
 * Требования:
 * retries в диапазоне 0–5, иначе InvalidRetriesException.
 * delayMs в диапазоне 100–10000, иначе InvalidDelayException.
 * Если exponential == true и retries == 0 — смысла нет → InvalidRetryPolicyException.
 * Обработка исключений внутри (multi-catch). Возврат true/false.
 * Исключения: по два конструктора.
 * Примеры:
 * validateRetryPolicy(3, 500, true) → true
 * validateRetryPolicy(0, 500, true) → false
 */
package exceptions.retryPolicyValidator;

public class RetryValidator {
    public static boolean validateRetryPolicy(int retries, long delayMs, boolean exponential){
        try{
            if(retries < 0 || retries > 5){
                throw new InvalidRetriesException("Invalid retries: should be 0 - 5; got " + retries);
            }
            if(delayMs < 100 || delayMs > 10000){
                throw new InvalidDelayException("Invalid Delay: should be 100 - 10000; got " + delayMs);
            }
            if(exponential && retries == 0){
                throw new InvalidRetryPolicyException("Invalid retry policy for exponential == true & retries == 0");
            }
            System.out.println("Valid retry policy.");
            return true;
        } catch(InvalidRetriesException | InvalidDelayException | InvalidRetryPolicyException e){
            System.out.println("Invalid retry policy: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(validateRetryPolicy(3, 500, true)); //  true
        System.out.println(validateRetryPolicy(0, 500, true)); // false
        System.out.println(validateRetryPolicy(6, 150, true)); // false
    }
}
