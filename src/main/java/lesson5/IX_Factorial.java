/**
 * Факториал.
 * Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
 * n! = 1*2*...*n;
 * 0! = 1;
 * 5! = 1*2*3*4*5;
 * Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.
 */
package lesson5;

public class IX_Factorial {
    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 6);
        int factorial = 1;

        for(int i = randomInt; i > 0; i--){
            factorial *= i;
        }

        System.out.println(randomInt + "! = " + factorial);
    }
}
