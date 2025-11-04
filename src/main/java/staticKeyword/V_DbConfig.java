/**
 * Добавь в DbConfig статический блок, который выводит "DB Config Loaded".
 * Проверь, что он срабатывает при первом обращении к классу.
 */
package staticKeyword;

public class V_DbConfig {
    static{
        System.out.println("DB Config Loaded");
    }

    public static void checkConfig() {
        System.out.println("Config test.");
    }

    public static void main(String[] args){
        checkConfig(); // сработает стататический блок
        checkConfig(); // статический блок больше выполняться не будет
    }
}
