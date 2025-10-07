/**
 * Гирлянда, часть 2.
 * Переписать гирлянду (Гирлянда, часть 1 (lesson4)) добавив следующий функционал:
 * Помощью класса Scanner введите число от 1 до 4.
 * Если введено число 1 - выполните метод мигания, 2 - проверку первой лампочки, 3 - метод бегущей строки, 4 - вывод состояния гирлянды на консоль.
 * Для выбора режима используйте оператор switch.
 * Измените метод мигания: метод должен мигнуть гирляндой 10 раз. Используем оператор for.
 * Измените метод бегущей строки: метод должен выполнить операцию 10 раз. Используем оператор for.
 */
package lesson5;

import java.util.Scanner;

public class VIII_Garland2 {
    public static void main(String[] args) {
        int garland = 32;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose garland mode (1-4): ");

        if (scanner.hasNextInt()) {
            int mode = scanner.nextInt();

            switch (mode) {
                case 1 -> {
                    System.out.println("Blink:");
                    blink(garland);
                }
                case 2 -> {
                    System.out.print("Is First Lamp On? ");
                    isFirstLampOn(garland);
                }
                case 3 -> {
                    System.out.println("Run");
                    run(garland);
                }
                case 4 -> {
                    System.out.print("The Current Garland State Is: ");
                    currentGarlandState(garland);
                }
                default -> System.out.println("Invalid mode.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
    static void blink(int garland){
        for (int i = 0; i < 10; i++) {
            garland = ~garland;
            System.out.println(Integer.toBinaryString(garland));
        }
    }
    static void run(int garland){
        for(int i = 0; i < 10; i++){
            garland = garland << 1;
            System.out.println(Integer.toBinaryString(garland));
        }
    }
    static void isFirstLampOn(int garland){
        int encrypting = 5;
        int encryptedGarland = garland ^ encrypting;
        int decryptedGarland = encryptedGarland ^ encrypting;
        System.out.println((decryptedGarland & 1) != 0);
    }
    static void currentGarlandState(int garland){
        System.out.println(String.format("%32s", Integer.toBinaryString(garland)).replace(' ', '0'));
    }
}
