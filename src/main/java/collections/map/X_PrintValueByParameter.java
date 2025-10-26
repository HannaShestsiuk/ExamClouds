/**
 * 10. Карта пользователей
 * Создай Map<String, String> — логин → email.
 * Добавь 3 пары и выведи email по логину "qaUser".
 */
package collections.map;

import java.util.HashMap;
import java.util.Map;

public class X_PrintValueByParameter {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<String,String>();

        userMap.put("qaUser", "qa@mail.com");
        userMap.put("devUser", "dev@mail.com");
        userMap.put("devOpsUser", "devops@mail.com");

        String qaEmail = userMap.get("qaUser");
        System.out.println("Email of qaUser: " + qaEmail);
    }
}
