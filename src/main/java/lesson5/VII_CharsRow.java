/**
 * Распечатать 5 символом циклом for.
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
package lesson5;

public class VII_CharsRow {
    public static void main(String[] args) {
        char letter = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(letter + " ");
            letter++;
        }
    }
}
