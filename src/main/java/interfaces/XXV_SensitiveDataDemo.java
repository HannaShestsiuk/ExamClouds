/**
 * Интерфейс SensitiveData без методов.
 * Создай класс CardInfo implements SensitiveData.
 * Сделай утилиту mask(Object o), которая пишет "***" если объект SensitiveData.
 */
package interfaces;

public class XXV_SensitiveDataDemo {
    public static String mask(Object o) {
        if (o instanceof XXV_SensitiveData) {
            return "***";
        }
        return o.toString();
    }

    public static void main(String[] args) {
        XXV_CardInfo card = new XXV_CardInfo("1234-5678-9876-5432");

        System.out.println("Card: " + mask(card));
    }
}
