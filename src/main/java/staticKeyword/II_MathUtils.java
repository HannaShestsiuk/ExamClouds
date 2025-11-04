/**
 * Напиши класс MathUtils с методом
 * public static int sum(int a, int b).
 * Вызови его без создания объекта.
 */
package staticKeyword;

public class II_MathUtils {
    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        int sum = sum(5, 11);
        System.out.println("Sum is " + sum);
    }
}
