/**
 * Загрузка конфигурации тестов из Map
 * Задача. Есть карта настроек:
 * Map<String, String> cfg = Map.of(
 *   "baseUrl", "https://example.com",
 *   "timeoutMs", "5000",
 *   "retries", "2"
 * );
 * Написать метод:
 * public static boolean loadConfig(Map<String, String> cfg)
 * Требования:
 * Обязательные ключи: baseUrl (начинается с http), timeoutMs (целое 100–30000), retries (целое 0–5).
 * Если ключ отсутствует — MissingPropertyException.
 * Если значение по формату неверное — InvalidPropertyValueException.
 * Внутри метода — multi-catch, вернуть true/false.
 * Исключения: по два конструктора.
 * Подсказка: для чисел — Integer.parseInt + проверка диапазона.
 */
package exceptions.testConfig;

import java.util.Map;

public class ConfigLoader {
    public static boolean loadConfig(Map<String,String> config){
        try{
            if(!config.containsKey("baseUrl")
                    || !config.containsKey("timeoutMs")
                    || !config.containsKey("retries")){
                throw new MissingPropertyException("Required Properties are missing: baseUrl, timeoutMs, retries");
            }
            String baseUrl = config.get("baseUrl");
            if(!baseUrl.startsWith("http")){
                throw new InvalidPropertyValueException("Invalid baseUrl: should start with 'http'.");
            }

            int timeout = Integer.parseInt(config.get("timeoutMs"));
            if(timeout < 100 || timeout > 30000){
                throw new InvalidPropertyValueException("Invalid timeoutMs: should be 100 - 30000; got " + timeout);
            }

            int retries = Integer.parseInt(config.get("retries"));
            if(retries < 0 || retries > 5){
                throw new InvalidPropertyValueException("Invalid retries: should be 0 - 5; got " + retries);
            }
            System.out.println("Config loaded successfully.");
            return true;
        } catch(MissingPropertyException | InvalidPropertyValueException e){
            System.out.println("Config load error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args){
        Map<String, String> cfg = Map.of(
                "baseUrl", "https://example.com",
                "timeoutMs", "5000",
                "retries", "2" );

        Map<String, String> invalidCfg1 = Map.of(
                "baseUrl", "https://example.com",
                "timeoutMs", "99",
                "retries", "2" );

        Map<String, String> invalidCfg2 = Map.of(
                "baseUrl", "url://example.com",
                "timeoutMs", "101",
                "retries", "2" );

        Map<String, String> invalidCfg3 = Map.of(
                "baseUrl", "http://example.com",
                "timeoutMs", "101",
                "retries", "6" );

        System.out.println("Valid config: " + loadConfig(cfg));
        System.out.println("Invalid config: " + loadConfig(invalidCfg1));
        System.out.println("Invalid config: " + loadConfig(invalidCfg2));
        System.out.println("Invalid config: " + loadConfig(invalidCfg3));
    }
}
