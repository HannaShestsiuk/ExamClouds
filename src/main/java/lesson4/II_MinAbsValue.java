/**
 * Меньшее по модулю число
 * Создать программу, которая будет выводить на экран меньшее по модулю
 * из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 * Для ввода чисел используем класс Scanner.
 */

package lesson4;

import java.util.Scanner;

public class II_MinAbsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        a = a >= 0 ? a : -a;
        b = b >= 0 ? b : -b;
        c = c >= 0 ? c : -c;

        double minAbs = (a < b && a < c) ? a : Math.min(b, c);

        System.out.println("Minimal absolute value is: " + minAbs);
        scanner.close();
    }
}
