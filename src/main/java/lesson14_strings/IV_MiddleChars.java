/**
 * Найти два средних знака строки
 * Даны строки разной длины (длина - четное число),
 *  необходимо вернуть ее два средних знака.
 *  Например, если дана строка "string" результат будет "ri",
 *      для строки "code" результат "od",
 *      для "Practice" результат "ct".
 */
package lesson14_strings;

public class IV_MiddleChars {
    public static void main(String[] args) {
        System.out.println(getMiddleTwo("string"));
        System.out.println(getMiddleTwo("code"));
        System.out.println(getMiddleTwo("Practice"));
    }

    public static String getMiddleTwo(String str) {
        int length = str.length();
        int middle = length / 2;

        return str.substring(middle - 1, middle + 1);
    }
}
