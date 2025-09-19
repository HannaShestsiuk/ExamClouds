/**
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 – "Вторник" и так далее. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 */
package lesson5;

public class III_WeekDaysIfElse {
    public static void main(String[] args) {
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        }
    }
}
