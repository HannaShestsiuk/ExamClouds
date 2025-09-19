/**
 * Гирлянда, часть 1
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * *метод blink, который будет мигать лампочками гирлянды один раз (операция ~);
 * *метод run, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * *метод isFirstLampOn, который будет выяснять включена ли лампочка в первой позиции (наложение маски с помощью &);
 * *метод, который будет распечатывать текущее состояние гирлянды. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 * Используйте побитовые операции.
 */

package lesson4;

public class III_Garland {
    public static void main(String[] args) {
        int garland = 32;
        System.out.println(Integer.toBinaryString(garland));

        System.out.println("Blink:");
        blink(garland);

        System.out.println("Run");
        run(garland);

        System.out.print("Is First Lamp On? ");
        isFirstLampOn(garland);

        System.out.print("The Current Garland State Is: ");
        currentGarlandState(garland);
    }
    static void blink(int garland){
        garland = ~garland;
        System.out.println(Integer.toBinaryString(garland));
    }
    static void run(int garland){
        garland = garland << 4;
        System.out.println(Integer.toBinaryString(garland));
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
