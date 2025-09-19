/**
 * Распечатать числа циклом do-while.
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
 */
package lesson5;

public class VI_DivisibleByFive {
    public static void main(String[] args) {
        int num = 1;
        do {
            if(num % 5 == 0){
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 100);
    }
}
