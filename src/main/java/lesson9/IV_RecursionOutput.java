/**
 * Рекурсивный вывод чисел
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
 * или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */
package lesson9;

public class IV_RecursionOutput {
    public static void returnNumbers(int A, int B) {
        System.out.print(A + " ");

        //recursion stops
        if (A == B) {
            return;
        }

        if (A < B) {
            returnNumbers(A + 1, B);
        } else {
            returnNumbers(A - 1, B);
        }
    }

    public static void main(String[] args) {
        System.out.print("A < B: ");
        returnNumbers(2, 5);

        System.out.println();

        System.out.print("A > B: ");
        returnNumbers(7, 3);
    }
}
