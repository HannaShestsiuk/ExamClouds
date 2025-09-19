/**
 * Калькулятор
 * Создать метод принимающий на вход две переменные типа int.
 * Метод вычисляет их сумму и возвращает значение.
 * Вызвать этот метод из метода main.
 * Сделать методы для вычисления разницы, произведения и деления.
 */
package lesson3;

public class III_Calculator {
    public static void main(String[] args) {
        int sum = sum(5, 8);
        System.out.println(sum);

        int subtraction = subtraction(14, 8);
        System.out.println(subtraction);

        int multiplication = multiplication(14, 8);
        System.out.println(multiplication);

        int division = (int) division(14, 8);
        System.out.println(division);
    }
    static int sum(int x, int y) {
        return x + y;
    }
    static int subtraction(int x, int y) {
        return x - y;
    }
    static int multiplication(int x, int y) {
        return x * y;
    }
    static int division(int x, int y) {
        return x / y;
    }
}
