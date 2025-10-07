/**
 * Проверка четности числа
 * Создать программу, которая будет сообщать, является ли целое число,
 * введённое пользователем, чётным или нет.
 * Ввод числа осуществлять с помощью класса Scanner.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
package lesson4;

import java.util.Scanner;

public class I_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if ( (num & 1) == 0 ) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }else {
            System.out.println("You did NOT enter an integer.");
        }
        scanner.close();
    }
}
