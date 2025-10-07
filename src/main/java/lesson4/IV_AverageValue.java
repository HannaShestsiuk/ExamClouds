/**
 * Среднее значение чисел
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
package lesson4;

public class IV_AverageValue {
    public static void main(String[] args) {
        String[] numbers = {"10.58", "20.12", "30.81"};

        getAverage(numbers);
    }

    static void getAverage(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);
    }
}
