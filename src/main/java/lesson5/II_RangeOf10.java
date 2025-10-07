/**
 * Число от 0 до 10.
 * С помощью класса Scanner ввести целое число.
 * Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”,
 * иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else.
 */

package lesson5;

import java.util.Scanner;

public class II_RangeOf10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 10: ");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 10){
            System.out.println("Положительное число меньше 10 или ноль");
        } else System.out.println("Положительное число больше 10 или отрицательное");

        scanner.close();
    }
}