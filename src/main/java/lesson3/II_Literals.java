/**
 * Написание литералов
 * Создать программу, в которой вывести на консоль литералы следующих видов:
 * логический
 * строковый
 * символьный
 * целочисленный 2-й
 * целочисленный 8-й
 * целочисленный 10-й
 * целочисленный 16-й
 * литерал типа float
 * литерал типа double.
 */

package lesson3;

public class II_Literals {
    public static void main(String[] args) {
        System.out.println("This is boolean = " + true);
        System.out.println("This is string = " + "Hanna");
        System.out.println("This is char = " + '@');
        System.out.println("This is boolean = " + true);
        System.out.println("This is binary = " + 0b111);
        System.out.println("This is octal = " + 017);
        System.out.println("This is hexadecimal = " + 0x90af);
        System.out.println("This is decimal = " + 187);
        System.out.println("This is float = " + 256.35);
        System.out.println("This is double = " + 1.7e+308);
    }
}
