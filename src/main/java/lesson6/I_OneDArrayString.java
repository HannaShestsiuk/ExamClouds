/**
 * Одномерный массив типа String.
 * Создать массив типа String с размером 7.
 * Записать в него значения дней недели.
 * Вывести на консоль значение последнего элемента.
 */
package lesson6;

public class I_OneDArrayString {
    public static void main(String[] args) {
        String[] days = new String[7];
        days = new String[] {"Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
        System.out.println(days[days.length - 1]);
    }
}
