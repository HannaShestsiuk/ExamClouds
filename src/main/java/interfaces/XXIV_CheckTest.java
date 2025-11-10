/**
 * Интерфейс Check с методом run().
 * Создай три реализации (StatusCheck, BodyCheck, HeaderCheck).
 * Положи их в List<Check> и вызови run() у всех.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;

public class XXIV_CheckTest {
    public static void main(String[] args) {
        List<XXIV_Check> checks = new ArrayList<>();
        checks.add(new XXIV_StatusCheck());
        checks.add(new XXIV_BodyCheck());
        checks.add(new XXIV_HeaderCheck());

        for (XXIV_Check check : checks){
            check.run();
        }
    }
}
