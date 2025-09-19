/**
 * Гирлянда с помощью массива.
 * Реализовать задачу с гирляндой (Гирлянда, часть 1 (lesson4)) используя массивы.
 * Для реализации бегущей строки используйте метод System.arraycopy(...);
 */
package lesson6;

import java.util.Arrays;

public class VI_Garland3 {
    public static void main(String[] args) {
        int[] garland = { 1, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Run");
        System.out.println(Arrays.toString(garland));
        run(garland);
    }

    static void run(int[] garland){
        int[] garlandRun = { 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.arraycopy(garland, 0, garlandRun, 1, 1);
        System.out.println(Arrays.toString(garlandRun));
        for(int i = 0; i < garlandRun.length - 2; i++){
            System.arraycopy(garlandRun, i, garlandRun, i + 1, 2);
            System.out.println(Arrays.toString(garlandRun));
        }
    }
}
