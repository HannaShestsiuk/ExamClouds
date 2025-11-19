/**
 * 13. Инвентаризация устройств
 * Есть Map<String, Integer>:
 * deviceName → quantity.
 * Если устройство "iPhone" отсутствует, добавь его с количеством 1.
 * Если присутствует — увеличь значение на 1.
 */
package collections.map;

import java.util.HashMap;
import java.util.Map;

public class XIII_ConditionalUpdate {
    public static void main(String[] args){
        Map<String, Integer> inventory = new HashMap<String, Integer>();

        inventory.put("MacBook", 2);
        inventory.put("PC", 10);
        inventory.put("iPad", 1);

        String deviceToUpdate = "iPhone";

        inventory.merge(deviceToUpdate, 1, (value, updatedValue) -> value + 1);

        System.out.println("First inventorization: \n" + deviceToUpdate + ": "+ inventory.get("iPhone"));

        inventory.merge(deviceToUpdate, 1, (value, updatedValue) -> value + 1);

        System.out.println("Second inventorization: \n" + deviceToUpdate + ": "+ inventory.get("iPhone"));
    }
}
