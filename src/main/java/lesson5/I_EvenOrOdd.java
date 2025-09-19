/**
 * Четное-нечетное.
 * Передать на вход программы число в качестве аргумента.
 * Если оно нечетное, распечатать его.
 * Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */
package lesson5;

public class I_EvenOrOdd {
    public static void main(String[] args) {
        String number = "5";
        int numberToInt = Integer.parseInt(number);
        if ( (numberToInt & 1) != 0 ) {
            System.out.println(numberToInt);
        }
    }
}
