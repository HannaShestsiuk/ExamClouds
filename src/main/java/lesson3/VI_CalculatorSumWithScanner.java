/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел,
 * введённых пользователем с помощью класса Scanner.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
package lesson3;

import java.util.Scanner;

public class VI_CalculatorSumWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value1: ");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            System.out.print("Enter int value2: ");
            if (scanner.hasNextInt()) {
                int y = scanner.nextInt();
                System.out.println("Sum is " + sum(x,y));
            } else {
                System.out.println("Invalid input");
            }
            scanner.close();
        } else {
            System.out.println("Invalid input");
            scanner.close();
        }
    }
    static int sum(int x, int y) {
        return x + y;
    }
}
