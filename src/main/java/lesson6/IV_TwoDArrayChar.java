/**
 * Двумерный массив типа char.
 * Создать двумерный массив типа char размером 4х2.
 * Записать в него значения с помощью блока для инициализации.
 * Распечатать значения массива.
 */
package lesson6;

public class IV_TwoDArrayChar {
    public static void main(String[] args) {
        char[][] arrayTwoD = {
                {'a', 'g'},
                {'q', 'w'},
                {'a', 's'},
                {'z', 'x'}
        };
        for (char[] arrayOneD : arrayTwoD) {
            for (char element : arrayOneD) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
