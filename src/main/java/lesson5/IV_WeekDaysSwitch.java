/**
 * Дни недели с оператором switch.
 * Переписать задание "3. Дни недели" используя оператор switch.
 */
package lesson5;

public class IV_WeekDaysSwitch {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Not a day of week");
        }
    }
}
